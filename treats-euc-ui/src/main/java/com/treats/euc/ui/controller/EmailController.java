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
import com.treats.euc.model.DocumentTemplate;
import com.treats.euc.pdf.PdfGenerator;
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
@RequestMapping("/treats-euc/email")
public class EmailController {

	@RequestMapping(value = "/send")
	public String sendEmail() throws Exception{
		
		
		PdfGenerator pdf = new PdfGenerator();
		
     	pdf.setPdfContent("<html><body> This is my Project </body></html>");
    	
     	ByteArrayOutputStream baos = pdf.generatePdf();
		EmailDeliveryServices sender = new EmailDeliveryServices();
		sender.sendEmailWithPdfAndDefaultSetup(baos);	
		 				
		return "success";
	}

}
