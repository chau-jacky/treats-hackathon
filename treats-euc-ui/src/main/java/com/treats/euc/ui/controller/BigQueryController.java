package com.treats.euc.ui.controller;

import org.springframework.web.bind.annotation.RestController;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.Dataset;
import com.google.cloud.bigquery.DatasetId;
import com.google.cloud.bigquery.Field;
import com.google.cloud.bigquery.FieldList;
import com.google.cloud.bigquery.Schema;
import com.google.cloud.bigquery.Table;
import com.google.cloud.bigquery.TableDefinition;
import com.google.cloud.bigquery.TableDefinition.Builder;
import com.google.cloud.bigquery.TableId;
import com.google.cloud.bigquery.TableResult;
import com.treats.euc.model.DocumentTemplate;
import com.treats.euc.ui.TreatsConstants;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/treats-euc/bigquery")
public class BigQueryController {

	private static BigQuery bigquery;

	BigQueryController() throws FileNotFoundException, IOException {

		GoogleCredentials credentials;
		File credentialsPath = new File("resources/treats-service-account.json");
		try (FileInputStream serviceAccountStream = new FileInputStream(credentialsPath)) {
			credentials = ServiceAccountCredentials.fromStream(serviceAccountStream);
		}

		bigquery = BigQueryOptions.newBuilder().setProjectId(TreatsConstants.CLOUD_PROJECT_ID).setCredentials(credentials).build().getService();
	}

	@RequestMapping("/getdatasets")
	public ArrayList<DatasetId> getDataSets() {

		ArrayList<DatasetId> listds = new ArrayList<DatasetId>();
		for (Dataset dataset : bigquery.listDatasets().iterateAll()) {
			listds.add(dataset.getDatasetId());
		}
		return listds;
	}

	@RequestMapping("/{dataset}/getdatatables")
	public ArrayList<TableId> getDataTables(@PathVariable String dataset) {
		ArrayList<TableId> listtable = new ArrayList<TableId>();
		for (Table table : bigquery.getDataset(dataset).list().iterateAll()) {
			listtable.add(table.getTableId());
		}
		return listtable;
	}
	
	@RequestMapping("/{dataset}/{datatable}/getfieldlist")
	public Schema getFieldList(@PathVariable String dataset, @PathVariable String datatable) {
		return bigquery.getTable(dataset, datatable).getDefinition().getSchema();
	}

	@RequestMapping("/getdefinitions/{dataset}/{datatable}")
	public String getDefinitions(@PathVariable String dataset, @PathVariable String datatable) {
		return bigquery.getDataset(dataset).get(datatable).getDefinition().toString();
	}
	
	@RequestMapping("/list")
	public String getData() {
		return bigquery.getDataset("hk_treats").get("trade_info").list().toString();
		
	}

}
