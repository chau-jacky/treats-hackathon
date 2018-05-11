package test.com.treats.euc.pdf;

import java.io.FileOutputStream;
import java.io.IOException;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class HelloWorldPDFLetter {

    /** Path to the resulting PDF file. */
    public static final String RESULT
        = "results/part1/chapter01/hello_letter.pdf";
 
    /**
     * Creates a PDF file: hello_letter.pdf.
     * @param    args    no arguments needed
     */
    public static void main(String[] args) throws DocumentException, IOException {
        // step 1
    	// Specifying the page size
        Document document = new Document(PageSize.LETTER);
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(RESULT));
        // step 3
        document.open();
        // step 4
        document.add(new Paragraph("Hello World"));
        // step 5
        document.close();
    }
}
