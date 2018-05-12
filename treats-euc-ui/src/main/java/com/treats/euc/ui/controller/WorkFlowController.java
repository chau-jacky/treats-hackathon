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
import com.treats.euc.services.EucFlowServicesInterface;
import com.treats.euc.services.EucFlowServicesMemory;
import com.treats.euc.ui.TreatsConstants;

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

@Controller
@RequestMapping("/treats-euc/workflow")
public class WorkFlowController {

	@RequestMapping(value = "/execute/{workflowId}")
	public String getDataSets(@PathVariable String workflowId) {

		Boolean success;
		
		// workflowobject = getworkflow(workflowId)
		
		
		// Simon
		// connection to BigQuery
		// BigQueryController.bigquery.xxxxxx
		// dataset = bigquery.executesql(workflowobject.sql)
		
		
		// @Henry
		// if workflow.output = excel
		//      pass to Excel generator
		
		
		EucFlowServicesInterface eucflow = new EucFlowServicesMemory();
		eucflow.getListEucFlow();
		
		// @Darwin
		//     templateobject = gettemplate (workflowobject.templateid)
		//     templatedetail = templateobject.gettemplate
		
		
		// ArrayList<html> = datamapping (templatedetail, dataset)
		
		
		// pdfgenerator(ArrayList<html>)
		
		
		
		success = false;
		if (! success) {
			return "fail";
		}	
		
		return "success";
	}

}
