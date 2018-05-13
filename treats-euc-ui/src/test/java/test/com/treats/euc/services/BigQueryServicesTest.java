package test.com.treats.euc.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import com.google.cloud.bigquery.Field;
import com.google.cloud.bigquery.JobException;
import com.google.cloud.bigquery.TableResult;
import com.treats.euc.model.EucFlow;
import com.treats.euc.services.BigQueryServices;
import com.treats.euc.services.EucFlowServicesInterface;
import com.treats.euc.services.EucFlowServicesMemory;

public class BigQueryServicesTest {

	@Test
	public void testBigQuery() throws JobException, InterruptedException, FileNotFoundException, IOException {
		BigQueryServices bigQueryServices = new BigQueryServices();
		
		EucFlowServicesInterface eucFlowServices = new EucFlowServicesMemory();
		ArrayList<EucFlow> eucFlowList = eucFlowServices.getListEucFlow();
		// TableResult queryResult = bigQueryServices.getTableResultByWorkflow(eucFlowList.get(1));
		// System.out.println(bigQueryServices.getDataSet());
		// ArrayList<String> fieldListString = BigQueryServices.getDataSchemaFromTableResult(queryResult);
		
		/*
		for (Iterator<String> iterator = fieldListString.iterator(); iterator.hasNext();) {
			String field = iterator.next();
			System.out.println(field + ",");
		}
		*/
		
		ArrayList<ArrayList<String>> tableArray = new ArrayList<ArrayList<String>>();
		tableArray = bigQueryServices.getTableArrayByWorkflow(eucFlowList.get(1));
		for (Iterator<ArrayList<String>> rowIterator = tableArray.iterator(); rowIterator.hasNext();) {
			for (Iterator<String> columnIterator = rowIterator.next().iterator(); columnIterator.hasNext();) {
				System.out.print(columnIterator.next() + ",");
			}
			System.out.println();
		}
		//System.out.println(BigQueryServices.getColumnSizeFromTableResult(queryResult));
		System.out.print("Table Row Size: ");
		System.out.println(tableArray.size()-1);
		if (tableArray.size() >= 1) {
			System.out.print("Table Column Size: ");
			System.out.println(tableArray.get(0).size());
		}
	}
	
	
}
