package com.treats.euc.pdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.junit.Test;
import org.xml.sax.SAXException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Font;
import com.itextpdf.text.Section;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class PdfGenerator {

	private static final Boolean False = null;
	private static Font catFont = new Font(Font.FontFamily.HELVETICA, 28, Font.BOLD);
	private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 28, Font.NORMAL, BaseColor.RED);
	private static Font greemFont = new Font(Font.FontFamily.HELVETICA, 28, Font.NORMAL, BaseColor.GREEN);

	private static Font time_Font = new Font(Font.FontFamily.HELVETICA, 12, Font.ITALIC);
	private static Font chaptor_Pass_Font = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
	private static Font chaptor_Fail_Font = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD, BaseColor.RED);

	private static Font normal_Font = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);
	private static Font normal_Red_Font = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.RED);
	private static Font normal_Bold_Red_Font = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD, BaseColor.RED);

	private static String outputMethod;
	private static String fullFileName;
	private static String pdfContent;
	private static String pdfHeader;
	private static String pdfFooter;
	private static Boolean isEncryted = False;

	public static final String headerImage = "src/main/resources/img/hackathon_img.jpg";
	public static final String barcodeImage = "src/main/resources/img/Barcode.jpg";

	static Chapter catPart;
	static Section subCatPart;

	public static String getOutputMethod() {
		return outputMethod;
	}

	public static void setOutputMethod(String outputMethod) {
		PdfGenerator.outputMethod = outputMethod;
	}

	public static String getPdfContent() {
		return pdfContent;
	}

	public static void setPdfContent(String pdfContent) {
		PdfGenerator.pdfContent = pdfContent;
	}

	public static String getFullFileName() {
		return fullFileName;
	}

	public static void setFullFileName(String fullFileName) {
		PdfGenerator.fullFileName = fullFileName;
	}

	public static String getPdfHeader() {
		return pdfHeader;
	}

	public static void setPdfHeader(String pdfHeader) {
		PdfGenerator.pdfHeader = pdfHeader;
	}

	public static String getPdfFooter() {
		return pdfFooter;
	}

	public static void setPdfFooter(String pdfFooter) {
		PdfGenerator.pdfFooter = pdfFooter;
	}

	public static Boolean getIsEncryted() {
		return isEncryted;
	}

	public static void setIsEncryted(Boolean isEncryted) {
		PdfGenerator.isEncryted = isEncryted;
	}

	/**
	 * Creates a PDF document.
	 * 
	 * @param filename
	 *            the path to the new PDF document
	 * @throws DocumentException
	 * @throws IOException
	 */
	public Document generatePdf() throws DocumentException, IOException {

		System.out.println("Generating report...");

		Document doc = new Document(PageSize.A4);
//		OutputStream file = new FileOutputStream(new File(fullFileName));
//		PdfWriter writer = PdfWriter.getInstance(doc, file);
		InputStream is = new ByteArrayInputStream(pdfContent.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PdfWriter writer = PdfWriter.getInstance(doc, baos);
		
		Paragraph p = new Paragraph("Monthly Statement", catFont);
		p.setAlignment(Element.ALIGN_CENTER);

		doc.open();
		
		// Create and add an Image
		Image img = Image.getInstance(headerImage);
		img.scaleToFit(PageSize.A4.getWidth(), img.getScaledHeight());
		img.setAbsolutePosition(0, PageSize.A4.getHeight() - img.getScaledHeight());
		doc.add(img);

		addEmptyLIne(doc, 3);
		//doc.add(p);

		//addEmptyLIne(doc, 1);
		//p = new Paragraph(pdfContent, chaptor_Pass_Font);
		//doc.add(p);
		XMLWorkerHelper.getInstance().parseXHtml(writer, doc, is);
		
		img = Image.getInstance(barcodeImage);
		img.scaleToFit(200, 500);
		img.setAbsolutePosition(PageSize.A4.getWidth() - PageSize.A4.getWidth() / 3, 0);
		doc.add(img);

		doc.close();
//		file.close();

		System.out.println("Report generation completed!");
		
		return doc;
	}

/*	public Metadata generatePdfMetadata() throws IOException, TikaException, SAXException, DocumentException {
		Metadata metadata = new Metadata();

		generatePdf();
		
		BodyContentHandler handler = new BodyContentHandler();
		FileInputStream inputstream = new FileInputStream(new File(fullFileName));
		ParseContext pcontext = new ParseContext();

		// parsing the document using PDF parser
		PDFParser pdfparser = new PDFParser();
		pdfparser.parse(inputstream, handler, metadata, pcontext);

		// getting the content of the document
		System.out.println("Contents of the PDF :" + handler.toString());

		// getting metadata of the document
		System.out.println("Metadata of the PDF:");
		String[] metadataNames = metadata.names();

		for (String name : metadataNames) {
			System.out.println(name + " : " + metadata.get(name));
		}

		return metadata;
	}*/

	private void sendEmailWithPdf() {
		/* Trigger email sending */
	}

	static void addEmptyLIne(Document doc, int number) throws DocumentException {
		for (int i = 0; i < number; i++) {
			doc.add(new Paragraph(" ", chaptor_Pass_Font));
		}
	}

	
	
	
}
