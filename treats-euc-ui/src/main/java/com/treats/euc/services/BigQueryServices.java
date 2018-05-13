package com.treats.euc.services;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.cloud.bigquery.BigQuery;
import com.treats.euc.model.EucFlow;
import com.treats.euc.ui.TreatsConstants;
import com.treats.euc.ui.controller.BigQueryController;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.Field;
import com.google.cloud.bigquery.FieldList;
import com.google.cloud.bigquery.FieldValueList;
import com.google.cloud.bigquery.Job;
import com.google.cloud.bigquery.JobException;
import com.google.cloud.bigquery.JobId;
import com.google.cloud.bigquery.JobInfo;
import com.google.cloud.bigquery.QueryJobConfiguration;
import com.google.cloud.bigquery.QueryResponse;
import com.google.cloud.bigquery.Schema;
import com.google.cloud.bigquery.TableResult;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

public class BigQueryServices {
	
	private BigQuery bigQuery;

	public BigQueryServices() throws FileNotFoundException, IOException {
		GoogleCredentials credentials;
		File credentialsPath = new File("resources/treats-service-account.json");
		try (FileInputStream serviceAccountStream = new FileInputStream(credentialsPath)) {
			credentials = ServiceAccountCredentials.fromStream(serviceAccountStream);
		}

		bigQuery = BigQueryOptions.newBuilder().setProjectId(TreatsConstants.CLOUD_PROJECT_ID).setCredentials(credentials).build().getService();
	}
	
	public TableResult getTableResultByWorkflow(EucFlow eucFlow) throws JobException, InterruptedException {
		
				DocTemplateServicesInterface docService = new DocTemplateServicesDataStore();
		DocumentTemplate docTemplate = docService.getDocumentTemplate(eucFlow.getDocumentTemplateID().toString());
		
		String dataSql;
		dataSql = "SELECT ";
		for (Iterator<String> iterator = docTemplate.getDataFields().iterator(); iterator.hasNext();) {
			String field = iterator.next();
			dataSql.concat(field);
			dataSql.concat(", ");
		}
		dataSql.substring(0, dataSql.length()-2);
		
		dataSql.concat(" FROM ");
		dataSql.concat(docTemplate.getDataSystem());
		dataSql.concat(".");
		dataSql.concat(docTemplate.getDataTable());
		dataSql.concat(" ");
		
		dataSql.concat(eucFlow.getFiler());
		
		QueryJobConfiguration queryConfig =
		        /* QueryJobConfiguration.newBuilder(
		          "SELECT "
		              + "TradeID, TradeType, Country, GroupMember, BranchNumber "
		              + "FROM hk_treats.trade_info LIMIT 1000") */
				QueryJobConfiguration.newBuilder(dataSql)
		            // Use standard SQL syntax for queries.
		            // See: https://cloud.google.com/bigquery/sql-reference/
		            .setUseLegacySql(false)
		            .build();

		//"SELECT TradeID, TradeType, Country, GroupMember, BranchNumber FROM hk_treats.trade_info LIMIT 1000"
		//SELECT TradeID, TradeType, Country, GroupMember, BranchNumber FROM [techfest-hackathon-4:hk_treats.trade_info] LIMIT 1000
	    // Create a job ID so that we can safely retry.
	    JobId jobId = JobId.of(UUID.randomUUID().toString());
	    Job queryJob = bigQuery.create(JobInfo.newBuilder(queryConfig).setJobId(jobId).build());

	    // Wait for the query to complete.
	    queryJob = queryJob.waitFor();

	    // Check for errors
	    if (queryJob == null) {
	      throw new RuntimeException("Job no longer exists");
	    } else if (queryJob.getStatus().getError() != null) {
	      // You can also look at queryJob.getStatus().getExecutionErrors() for all
	      // errors, not just the latest one.
	      throw new RuntimeException(queryJob.getStatus().getError().toString());
	    }

	    // Get the results.
	    QueryResponse response = bigQuery.getQueryResults(jobId);

	    TableResult result = queryJob.getQueryResults();
	    
	    /* int tradeCount = 1;
	    // Print all pages of the results.
	    for (FieldValueList row : result.iterateAll()) {
	      String tradeId = row.get("TradeID").getStringValue();
	      String tradeType = row.get("TradeType").getStringValue();
	      System.out.println("Trade " + tradeCount + ": " + tradeId + " TradeType: " + tradeType);
	      ++tradeCount;
	    }*/
	    return result;
	}
	
	public ArrayList<ArrayList<String>> getTableArrayByWorkflow(EucFlow eucFlow) throws InterruptedException {
		ArrayList<String> fieldArray = new ArrayList<String>();
		ArrayList<ArrayList<String>> tableArray = new ArrayList<ArrayList<String>>();
		
		String dataSql = eucFlow.getSql();
		
		QueryJobConfiguration queryConfig =
				QueryJobConfiguration.newBuilder(dataSql)
		            .setUseLegacySql(false)
		            .build();

	    JobId jobId = JobId.of(UUID.randomUUID().toString());
	    Job queryJob = bigQuery.create(JobInfo.newBuilder(queryConfig).setJobId(jobId).build());

	    // Wait for the query to complete.
	    queryJob = queryJob.waitFor();

	    // Check for errors
	    if (queryJob == null) {
	      throw new RuntimeException("Job no longer exists");
	    } else if (queryJob.getStatus().getError() != null) {
	      // You can also look at queryJob.getStatus().getExecutionErrors() for all
	      // errors, not just the latest one.
	      throw new RuntimeException(queryJob.getStatus().getError().toString());
	    }

	    // Get the results.
	    QueryResponse response = bigQuery.getQueryResults(jobId);

	    TableResult result = queryJob.getQueryResults();
	    
	    fieldArray = BigQueryServices.getDataSchemaFromTableResult(result);
	    
	    tableArray.add(fieldArray);
	    
	    for (FieldValueList row : result.iterateAll()) {
	    	ArrayList<String> tableRecord = new ArrayList<String>();
	    	for (Iterator<String> iterator = fieldArray.iterator(); iterator.hasNext();)  {
	    		tableRecord.add(row.get(iterator.next()).getStringValue());
	    	}
	    	tableArray.add(tableRecord);
	    }
	    return tableArray;
	}
	
	public static ArrayList<String> getDataSchemaFromTableResult(TableResult result) {
		ArrayList<String> fieldListString = new ArrayList<String>();
		Schema schema = result.getSchema();
		FieldList fieldList = schema.getFields();
		for (Iterator<Field> iterator = fieldList.iterator(); iterator.hasNext();) {
			Field field = iterator.next();
			fieldListString.add(field.getName());
		}
		return fieldListString;
	}
	
	public static int getColumnSizeFromTableResult(TableResult result) {
		Schema schema = result.getSchema();
		FieldList fieldList = schema.getFields();
		return fieldList.size();
	}
	
}
