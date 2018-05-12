package test.com.treats.euc.services;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.junit.Test;

public class ExcelOutputTest {

	public ArrayList<Object[]> getTableData(){
        ArrayList<Object[]> tableDataList = null;
    
        return tableDataList;
    }
	
	public void doExport(ArrayList<Object[]> dataList){
        /*if(dataList != null && !dataList.isEmpty()){*/
            HSSFWorkbook workBook = new HSSFWorkbook();
            HSSFSheet sheet = workBook.createSheet();
            
            if(dataList != null && !dataList.isEmpty()){
	            short rowNo = 0;
	            for (Object[] objects : dataList) {
	                HSSFRow row = sheet.createRow(rowNo);
	                row.createCell((short)0).setCellValue(objects[0].toString());
	                row.createCell((short)1).setCellValue(objects[1].toString());
	                row.createCell((short)2).setCellValue(objects[2].toString());
	                row.createCell((short)3).setCellValue(objects[3].toString());
	                rowNo++;
	            }
            }
             
            String file = "D:/Hackathon/test.xls";
            try{
                FileOutputStream fos = new FileOutputStream(file);
                workBook.write(fos);
                fos.flush();
                workBook.close();
            }catch(FileNotFoundException e){
                e.printStackTrace();
                System.out.println("Invalid directory or file not found");
            }catch(IOException e){
                e.printStackTrace();
                System.out.println("Error occurred while writting excel file to directory");
            }
        /*}*/
    }
     
    public static void main(String[] args) {
    	ExcelOutputTest excelOutputTest = new ExcelOutputTest();
        ArrayList<Object[]> dataList = excelOutputTest.getTableData();
        /*if(dataList != null && dataList.size() > 0){*/
        	excelOutputTest.doExport(dataList);
        	System.out.println("Excel is generated");
        /*}else{
            System.out.println("There is no data available in the table to export");
        }*/
    }
	
}
