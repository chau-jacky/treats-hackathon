package com.treats.euc.ui.controller;

import org.springframework.web.bind.annotation.RestController;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.Dataset;
import com.google.cloud.bigquery.DatasetId;
import com.google.cloud.bigquery.Table;
import com.google.cloud.bigquery.TableDefinition;
import com.google.cloud.bigquery.TableDefinition.Builder;
import com.google.cloud.bigquery.TableId;
import com.google.cloud.bigquery.TableResult;
import com.treats.euc.excel.ExcelGenerator;
import com.treats.euc.model.DocumentTemplate;
import com.treats.euc.model.EucFlow;
import com.treats.euc.pdf.PdfGenerator;
import com.treats.euc.services.BigQueryServices;
import com.treats.euc.services.DataMappingServices;
import com.treats.euc.services.DocTemplateServicesDataStore;
import com.treats.euc.services.DocTemplateServicesInterface;
import com.treats.euc.services.DocTemplateServicesMemory;
import com.treats.euc.services.EmailDeliveryServices;
import com.treats.euc.services.EucFlowServicesInterface;
import com.treats.euc.services.EucFlowServicesMemory;
import com.treats.euc.ui.TreatsConstants;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/treats-euc/workflow")
public class WorkFlowRestController {

	@RequestMapping(value = "/execute/{workflowId}")
	public String getDataSets(@PathVariable String workflowId) throws Exception {
		System.out.println("execute workflow " + workflowId);

		BigQueryServices bigQueryServices = new BigQueryServices();

		EucFlowServicesInterface flowService = new EucFlowServicesMemory();
		DocTemplateServicesInterface docTemplateService = new DocTemplateServicesDataStore();

		EucFlow flowObject = flowService.getEucFlow(workflowId);
		DocumentTemplate docTemplate = docTemplateService.getDocumentTemplate(flowObject.getDocumentTemplateID().toString());

		
		if (flowObject.getOutputFormat().equals("EXCEL")) {
			System.out.println("Excel output");
			
			ArrayList<ArrayList<String>> tableArray = bigQueryServices.getTableArrayByWorkflow(flowObject);

			ExcelGenerator excelGenerator = new ExcelGenerator();
			if (flowObject.getOutputMedium().equals("EMAIL")) {
				System.out.println("Excel-Email output");
				// TODO : add email address
				excelGenerator.excelEmailSend(tableArray, flowObject.getEmailAddress());
				// excelGenerator.excelEmailSend(tableArray);
			} else if (flowObject.getOutputMedium().equals("SERVER")) {
				System.out.println("Excel-Server output");
				// TODO : save excel to server
				excelGenerator.excelDownload(tableArray);
			}

		} else if (flowObject.getOutputFormat().equals("PDF")) {
			System.out.println("PDF output");

			TableResult tableResult = bigQueryServices.getTableResultByWorkflow(flowObject);
			
			DataMappingServices dataMappingServices = new DataMappingServices();
			ArrayList<String> listResultPDF = dataMappingServices.matchPattern(docTemplate.getDocTemplate(), tableResult);
			
			PdfGenerator pdf = new PdfGenerator();
			pdf.generatePdf(listResultPDF, flowObject.getEmailAddress());
			
		}

		return "success";
	}

}
