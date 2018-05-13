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
		TableResult queryResult = bigQueryServices.getDataSetByWorkflow(eucFlowList.get(1));
		// System.out.println(bigQueryServices.getDataSet());
		ArrayList<String> fieldListString = BigQueryServices.getDataSchemaFromTableResult(queryResult);
		
		for (Iterator<String> iterator = fieldListString.iterator(); iterator.hasNext();) {
			String field = iterator.next();
			System.out.println(field + ",");
		}
	}
	
	
}
