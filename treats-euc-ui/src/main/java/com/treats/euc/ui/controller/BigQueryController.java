package com.treats.euc.ui.controller;

import org.springframework.web.bind.annotation.RestController;

import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.Dataset;
import com.google.cloud.bigquery.DatasetId;
import com.google.cloud.bigquery.Table;
import com.google.cloud.bigquery.TableDefinition;
import com.google.cloud.bigquery.TableDefinition.Builder;
import com.google.cloud.bigquery.TableId;
import com.treats.euc.model.DocumentTemplate;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/treats-euc/bigquery")
public class BigQueryController {

	private static BigQuery bigquery = BigQueryOptions.getDefaultInstance().getService();

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
    
    @RequestMapping("/getdefinitions/{dataset}/{datatable}")
    public String getDefinitions(@PathVariable String dataset, @PathVariable String datatable) {
		return bigquery.getDataset(dataset).get(datatable).getDefinition().toString();
    }
    
	
	
}
