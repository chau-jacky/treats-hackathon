package test.com.treats.euc.services;

import java.util.ArrayList;
//import org.junit.Test;

import com.treats.euc.services.DataMappingServices;


public class DataMappingServiceTest {

	public static void main(String s[]) throws Exception {
		ArrayList<String> pdfContent = null;
		String template;
		DataMappingServices dms = new DataMappingServices();
		ArrayList<String> dataList = new ArrayList<String>();

		dataList.add("SPT18000999920180101");
		dataList.add("SPT18000999820180102");
		dataList.add("SPT18000999720180103");
		
		// testArray[0] = "DealNumber";
		// testArray[1] = "DealDate";
		// testArray[2] = "DealAmount";
		// testArray[3] = "DealPrice";
		// testArraryList.add(1,testArray);

		template = "<h1>This is a PDF Statement Template for @DealNumber@ as of @DealDate@.</h1>";
		template = template + " <body>@DealNumber@ is a spot deal.</body>";

		pdfContent = dms.matchPattern(template, dataList);

		for (int i = 0; i < pdfContent.size(); i++) {
			System.out.println("Index: " + i + " - Item: " + pdfContent.get(i));
		}

	}
}
