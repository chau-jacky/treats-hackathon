package test.com.treats.euc.pdftest;

import org.junit.Test;



import test.com.treats.euc.pdf.HelloWorldPDF;

public class PdfTest {

	@Test
    public void testCase1() throws Exception {
    	
    	HelloWorldPDF pdf = new HelloWorldPDF();
    	
    	pdf.setOutputMethod("L");	//Save to Local
    	pdf.setFullFileName("C:\\temp\\testing3.pdf");
      	pdf.setPdfContent("This is a testing PDF Statement");
//    	pdf.setPdfContent("<h1>Test</h1><p>Hello World</p>");
    	
    	pdf.generatePdf();

    }
	
}
