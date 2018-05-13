package com.treats.euc.pdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.util.ArrayList;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.ByteArrayInputStream;
//import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

//import org.apache.tika.exception.TikaException;
//import org.apache.tika.metadata.Metadata;
//import org.apache.tika.parser.ParseContext;
//import org.apache.tika.parser.pdf.PDFParser;
//import org.apache.tika.sax.BodyContentHandler;
//import org.xml.sax.SAXException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
//import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Font;
import com.itextpdf.text.Section;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.treats.euc.services.EmailDeliveryServices;

public class PdfGenerator {

	private static final Boolean False = null;
	private static Font catFont = new Font(Font.FontFamily.HELVETICA, 28, Font.BOLD);
	// private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 28,
	// Font.NORMAL, BaseColor.RED);
	// private static Font greemFont = new Font(Font.FontFamily.HELVETICA, 28,
	// Font.NORMAL, BaseColor.GREEN);

	private static Font time_Font = new Font(Font.FontFamily.HELVETICA, 12, Font.ITALIC);
	private static Font chaptor_Pass_Font = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
	// private static Font chaptor_Fail_Font = new Font(Font.FontFamily.HELVETICA,
	// 14, Font.BOLD, BaseColor.RED);

	private static Font normal_Font = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);
	// private static Font normal_Red_Font = new Font(Font.FontFamily.HELVETICA, 10,
	// Font.NORMAL, BaseColor.RED);
	// private static Font normal_Bold_Red_Font = new
	// Font(Font.FontFamily.HELVETICA, 10, Font.BOLD, BaseColor.RED);

	private String outputMethod = "EMAIL";
	private String fullFileName;
	private String pdfContent;
	private String pdfHeader;
	private String pdfFooter;
	private Boolean isEncryted = False;

	public static final String headerImage = "src/main/resources/img/hackathon_img.jpg";
	public static final String barcodeImage = "src/main/resources/img/Barcode.jpg";

	static Chapter catPart;
	static Section subCatPart;

	public String getOutputMethod() {
		return outputMethod;
	}

	public void setOutputMethod(String outputMethod) {
		this.outputMethod = outputMethod;
	}

	public String getFullFileName() {
		return fullFileName;
	}

	public void setFullFileName(String fullFileName) {
		this.fullFileName = fullFileName;
	}

	public String getPdfContent() {
		return pdfContent;
	}

	public void setPdfContent(String pdfContent) {
		this.pdfContent = pdfContent;
	}

	public String getPdfHeader() {
		return pdfHeader;
	}

	public void setPdfHeader(String pdfHeader) {
		this.pdfHeader = pdfHeader;
	}

	public String getPdfFooter() {
		return pdfFooter;
	}

	public void setPdfFooter(String pdfFooter) {
		this.pdfFooter = pdfFooter;
	}

	public Boolean getIsEncryted() {
		return isEncryted;
	}

	public void setIsEncryted(Boolean isEncryted) {
		this.isEncryted = isEncryted;
	}

	/**
	 * Creates a PDF document.
	 * 
	 * @param filename
	 *            the path to the new PDF document
	 * @throws DocumentException
	 * @throws IOException
	 */
	public ByteArrayOutputStream generatePdf() throws DocumentException, IOException {

		System.out.println("Generating report...");

		Document doc = new Document(PageSize.A4);
		InputStream is = new ByteArrayInputStream(pdfContent.getBytes());
		//OutputStream file = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PdfWriter writer = PdfWriter.getInstance(doc, baos);
		
		//if (outputMethod.equals("EMAIL")) {
		is = new ByteArrayInputStream(pdfContent.getBytes());
		baos = new ByteArrayOutputStream();
		writer = PdfWriter.getInstance(doc, baos);
		//} else if (outputMethod.equals("SERVER")) {
		//	file = new FileOutputStream(new File(fullFileName));
	    //	writer = PdfWriter.getInstance(doc, file);
		//}
		
		Paragraph p = new Paragraph("Monthly Statement", catFont);
		p.setAlignment(Element.ALIGN_CENTER);

		doc.open();

		// Create and add an Image
		Image img = Image.getInstance(headerImage);
		img.scaleToFit(PageSize.A4.getWidth(), img.getScaledHeight());
		img.setAbsolutePosition(0, PageSize.A4.getHeight() - img.getScaledHeight());
		doc.add(img);

		addEmptyLIne(doc, 3);
		// doc.add(p);

		// addEmptyLIne(doc, 1);
		// p = new Paragraph(pdfContent, chaptor_Pass_Font);
		// doc.add(p);
		XMLWorkerHelper.getInstance().parseXHtml(writer, doc, is);

		img = Image.getInstance(barcodeImage);
		img.scaleToFit(200, 500);
		img.setAbsolutePosition(PageSize.A4.getWidth() - PageSize.A4.getWidth() / 3, 0);
		doc.add(img);

		doc.close();
		// file.close();

		System.out.println("Report generation completed!");

		return baos;
	}

	public void generatePdf(ArrayList<String> PdfHtmlList) throws DocumentException, IOException, MessagingException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		for (int i = 0; i < PdfHtmlList.size(); i++) {
			pdfContent = PdfHtmlList.get(i);
			baos = generatePdf();

			// send email statement
			EmailDeliveryServices sender = new EmailDeliveryServices();
			sender.sendEmailWithPdfAndDefaultSetup(baos);
		}
	}

	public void generatePdf(ArrayList<String> PdfHtmlList, String email)
			throws DocumentException, IOException, MessagingException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		for (int i = 0; i < PdfHtmlList.size(); i++) {
			pdfContent = PdfHtmlList.get(i);
			baos = generatePdf();

			// send email statement
			EmailDeliveryServices sender = new EmailDeliveryServices();
			// TODO: sender.sendEmailWithPdfAndDefaultSetup(baos, email);
		}
	}

	public void generatePdf(ArrayList<String> PdfHtmlList, HttpServletRequest request, HttpServletResponse response)
			throws DocumentException, IOException, MessagingException {
		ByteArrayOutputStream baos = null;
		OutputStream os = null;

		for (int i = 0; i < PdfHtmlList.size(); i++) {

			baos = new ByteArrayOutputStream();
			pdfContent = PdfHtmlList.get(i);
			// baos = new ByteArrayOutputStream();
			baos = generatePdf();

			// setting some response headers
			response.setHeader("Expires", "0");
			response.setHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
			response.setHeader("Pragma", "public");
			// setting the content type
			response.setContentType("application/pdf");
			// the contentlength
			response.setContentLength(baos.size());
			// write ByteArrayOutputStream to the ServletOutputStream
			os = response.getOutputStream();
			baos.writeTo(os);
			os.flush();
			os.close();
		}

	}

	/*
	 * public Metadata generatePdfMetadata() throws IOException, TikaException,
	 * SAXException, DocumentException { Metadata metadata = new Metadata();
	 * 
	 * generatePdf();
	 * 
	 * BodyContentHandler handler = new BodyContentHandler(); FileInputStream
	 * inputstream = new FileInputStream(new File(fullFileName)); ParseContext
	 * pcontext = new ParseContext();
	 * 
	 * // parsing the document using PDF parser PDFParser pdfparser = new
	 * PDFParser(); pdfparser.parse(inputstream, handler, metadata, pcontext);
	 * 
	 * // getting the content of the document
	 * System.out.println("Contents of the PDF :" + handler.toString());
	 * 
	 * // getting metadata of the document
	 * System.out.println("Metadata of the PDF:"); String[] metadataNames =
	 * metadata.names();
	 * 
	 * for (String name : metadataNames) { System.out.println(name + " : " +
	 * metadata.get(name)); }
	 * 
	 * return metadata; }
	 */

	static void addEmptyLIne(Document doc, int number) throws DocumentException {
		for (int i = 0; i < number; i++) {
			doc.add(new Paragraph(" ", chaptor_Pass_Font));
		}
	}
	
	
	public void generatePdfToLocal() throws DocumentException, IOException {

		System.out.println("Generating report...");

		Document doc = new Document(PageSize.A4);
		InputStream is = new ByteArrayInputStream(pdfContent.getBytes());
		OutputStream file = new FileOutputStream(new File(fullFileName));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PdfWriter writer = PdfWriter.getInstance(doc, file);
		
		//is = new ByteArrayInputStream(pdfContent.getBytes());
		baos = new ByteArrayOutputStream();
		writer = PdfWriter.getInstance(doc, baos);

		
		Paragraph p = new Paragraph("Monthly Statement", catFont);
		p.setAlignment(Element.ALIGN_CENTER);

		doc.open();

		// Create and add an Image
		Image img = Image.getInstance(headerImage);
		img.scaleToFit(PageSize.A4.getWidth(), img.getScaledHeight());
		img.setAbsolutePosition(0, PageSize.A4.getHeight() - img.getScaledHeight());
		doc.add(img);

		addEmptyLIne(doc, 3);
		// doc.add(p);

		// addEmptyLIne(doc, 1);
		// p = new Paragraph(pdfContent, chaptor_Pass_Font);
		// doc.add(p);
		XMLWorkerHelper.getInstance().parseXHtml(writer, doc, new StringReader(pdfContent));
		//XMLWorkerHelper.getInstance().parseXHtml(writer, doc, in);

		img = Image.getInstance(barcodeImage);
		img.scaleToFit(200, 500);
		img.setAbsolutePosition(PageSize.A4.getWidth() - PageSize.A4.getWidth() / 3, 0);
		doc.add(img);

		doc.close();
		// file.close();

		System.out.println("Report generation completed!");
	}
	
	

}
