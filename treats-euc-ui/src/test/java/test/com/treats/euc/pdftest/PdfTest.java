package test.com.treats.euc.pdftest;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import org.apache.tika.metadata.Metadata;
import org.junit.Test;

import com.treats.euc.pdf.PdfGenerator;
import com.itextpdf.text.Document;

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
    	PdfGenerator pdf = new PdfGenerator();
    	Metadata metadataTest = new Metadata();
    	
    	pdf.setOutputMethod("L");	//Save to Local
    	pdf.setFullFileName("C:\\temp\\testing6.pdf");
      	pdf.setPdfContent("This is a testing PDF Statement");
    	
      	metadataTest = pdf.generatePdfMetadata();
      	
 //     	pdf.generatePdf();
	}
}
