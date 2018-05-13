package com.treats.euc.services;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.regex.Matcher;

public class DataMappingServices {

	private static String pdfPattern = "@(\\w+)@";

	public ArrayList<String> matchPattern(String templateDetails, ArrayList<String> dataset) {
		String matchedString = "";
		String fieldName = "";
		String fieldValue = "";
		String pdfContentAfterMatching = templateDetails;
		ArrayList<String> pdfContentAfterMatchingList = new ArrayList<String>();

		// Create a Pattern object
		Pattern pattern = Pattern.compile(pdfPattern);

		// Now create matcher object.
		Matcher matcher = null;

		for (int i = 0; i < dataset.size(); i++) {
			pdfContentAfterMatching = templateDetails;
			matcher = pattern.matcher(pdfContentAfterMatching);
			
			while (matcher.find()) {

				matchedString = matcher.group(0);
				fieldName = matcher.group(1);

//				System.out.println(matchedString);
//				System.out.println(matcher.group(1).toString());
				
				//Testing only - start
				if (fieldName.equals("DealNumber")) {
					fieldValue = dataset.get(i).substring(0, 12);
				} else if (fieldName.equals("DealDate")) {
					fieldValue = dataset.get(i).substring(12, 20);
				}
				//Testing only - end
				
//				System.out.println(fieldName);
//				System.out.println(fieldValue);

				pdfContentAfterMatching = pdfContentAfterMatching.replaceAll(matchedString, fieldValue);
				matcher = pattern.matcher(pdfContentAfterMatching);
			
			}
//			System.out.println(pdfContentAfterMatching);
			pdfContentAfterMatchingList.add(pdfContentAfterMatching);
		}

		return pdfContentAfterMatchingList;
	}

}
