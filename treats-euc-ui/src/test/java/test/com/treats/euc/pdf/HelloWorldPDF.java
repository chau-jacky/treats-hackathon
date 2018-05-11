package test.com.treats.euc.pdf;

import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class HelloWorldPDF {

    /** Path to the resulting PDF file. */
//    public static final String RESULT
//        = "results/part1/chapter01/hello.pdf";
    
    private static String outputMethod;
    private static String fullFileName;
    private static String pdfContent;
    
        public static String getOutputMethod() {
		return outputMethod;
	}

	public static void setOutputMethod(String outputMethod) {
		HelloWorldPDF.outputMethod = outputMethod;
	}

	public static String getPdfContent() {
		return pdfContent;
	}

	public static void setPdfContent(String pdfContent) {
		HelloWorldPDF.pdfContent = pdfContent;
	}

	public static String getFullFileName() {
		return fullFileName;
	}

	public static void setFullFileName(String fullFileName) {
		HelloWorldPDF.fullFileName = fullFileName;
	}

	/**
     * Creates a PDF file: hello.pdf
     * @param    args    no arguments needed
     */
/*    public static void main(String[] args)
    	throws DocumentException, IOException {
    	new HelloWorldPDF().createPdf(RESULT);
    }
*/ 
    @Test
/*    public void testCase1() throws Exception {
    	
    	HelloWorldPDF a = new HelloWorldPDF()
    	
    	createPdf("C:\\temp\\aaa.pdf");
    }
*/    
    /**
     * Creates a PDF document.
     * @param filename the path to the new PDF document
     * @throws    DocumentException 
     * @throws    IOException 
     */
    public void generatePdf()
	throws DocumentException, IOException {

    	System.out.println("Generating report...");
    	
    	System.getProperty("user.dir");
    	// step 1
        Document document = new Document(PageSize.A4);
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(fullFileName));	
        // step 3
        document.open();
        // step 4
        document.add(new Paragraph(pdfContent));
        // step 5
        document.close();
        
        if (outputMethod == "E") {
        	System.out.println("Sending email...");
        	sendEmailWithPdf();
        }
        
        System.out.println("Report generation completed!");
    }
    
    private void sendEmailWithPdf() {
    	/* Trigger email sending */
    }
    
    
	
}
