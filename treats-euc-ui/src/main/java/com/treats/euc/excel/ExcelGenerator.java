package com.treats.euc.excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;

import java.util.ArrayList;
import java.util.Iterator;

import javax.mail.MessagingException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.treats.euc.services.EmailDeliveryServices;


public class ExcelGenerator {

	public ArrayList<ArrayList<String>> getTableData(){
        
		/*test*/
		ArrayList<String> header = new ArrayList<String>();
		header.add("Field1");
		header.add("Field2");
		header.add("Field3");
		header.add("Field4");
		ArrayList<String> record = new ArrayList<String>();
		record.add("Data1");
		record.add("Data2");
		record.add("Data3");
		record.add("Data4");
		
		ArrayList<ArrayList<String>> tableDataList = new ArrayList<ArrayList<String>>();
        tableDataList.add(header);
        tableDataList.add(record);
        
        System.out.println("Printing tableDataList...");
        for (Iterator iterator = tableDataList.iterator(); iterator.hasNext();) {
			ArrayList<String> arrayList = (ArrayList<String>) iterator.next();
			for (Iterator iterator2 = arrayList.iterator(); iterator2.hasNext();) {
				String string = (String) iterator2.next();
				System.out.println(string);
			}
		}
            
        return tableDataList;
    }
	
	public HSSFWorkbook getWorkBook(){
		
		
        HSSFWorkbook workBook = new HSSFWorkbook();
        HSSFSheet sheet = workBook.createSheet();
        
        System.out.println("Getting Table Data...");
        ArrayList<ArrayList<String>> dataList = this.getTableData();
        
        System.out.println("Generating Excel Workbook...");
        
        short rowNo = 0;
        
        
        for (Iterator iterator = dataList.iterator(); iterator.hasNext();) {
			ArrayList<String> arrayList = (ArrayList<String>) iterator.next();
			
			HSSFRow row = sheet.createRow(rowNo);
			
			short colNo = 0;
			
			for (Iterator iterator2 = arrayList.iterator(); iterator2.hasNext();) {
				String string = (String) iterator2.next();
				
				row.createCell(colNo).setCellValue(string);
				
				System.out.println("Write row "+rowNo+", col "+colNo+","+string);
				
				colNo++;
			}
			
			rowNo++;
		}
        
        
            
        return workBook;
    }
	
	public void excelDownload(HSSFWorkbook workBook){

		System.out.println("Downloadeding Excel...");
        String file = "D:/Hackathon/test.xls";
        try{
            FileOutputStream fos = new FileOutputStream(file);
            workBook.write(fos);
            fos.flush();
            workBook.close();
            System.out.println("Excel Downloaded!");
            

        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Error occurred while writting excel file to directory");
        }
    
}
	
	public void excelEmailSend(HSSFWorkbook workBook) throws Exception{

        try{
            
        	System.out.println("Converting Excel Workbook to Byte Array...");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            workBook.write(baos);
                        
            System.out.println("Sending Excel by email...");
            EmailDeliveryServices sender = new EmailDeliveryServices();
    		sender.sendEmailWithExcelAndDefaultSetup(baos);	
    		System.out.println("Email sent!");
    		
    		workBook.close();
          
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Error occurred while writting excel file to directory");
        }

}
	
  
	
	
	public static void main(final String[] args) throws Exception {
		
        /*test*/
		ExcelGenerator excelGenerator = new ExcelGenerator();
		
		
		excelGenerator.excelDownload(excelGenerator.getWorkBook());
		
		excelGenerator.excelEmailSend(excelGenerator.getWorkBook());
		
        
    }
	

}
