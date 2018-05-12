package test.com.treats.euc.pdftest;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;

import org.apache.tika.metadata.Metadata;
import org.junit.Test;

import com.treats.euc.pdf.PdfGenerator;
import com.itextpdf.text.Document;
import com.treats.euc.pdf.PdfServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PdfTest {

/*
    public void testCase1() throws Exception {
    	
    	HelloWorldPDF pdf = new HelloWorldPDF();
    	
    	pdf.setOutputMethod("L");	//Save to Local
    	pdf.setFullFileName("C:\\temp\\testing3.pdf");
      	pdf.setPdfContent("This is a testing PDF Statement");
//    	pdf.setPdfContent("<h1>Test</h1><p>Hello World</p>");
    	
    	pdf.generatePdf();

    }
*/
	public static void main(String s[]) throws Exception {
    	//PdfGenerator pdf = new PdfGenerator();
    	//Metadata metadataTest = new Metadata();
    	
//    	pdf.setOutputMethod("L");	//Save to Local
//    	pdf.setFullFileName("C:\\temp\\testing8.pdf");
//      	pdf.setPdfContent("This is a testing PDF Statement");
//      	pdf.setPdfContent("<html><body> This is my Project </body></html>");
    	
//      	metadataTest = pdf.generatePdfMetadata();
      	
//     	pdf.generatePdf();
    	
    	
    	HttpServletRequest request = null;
    	HttpServletResponse response = null;
    	
    	PdfServlet pdfsl = new PdfServlet();
    	pdfsl.service(request, response);
	}
}
