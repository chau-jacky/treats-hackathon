package com.treats.euc.pdf;

import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfAction;
import com.itextpdf.text.pdf.PdfFormField;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PushbuttonField;
import com.itextpdf.text.pdf.TextField;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
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

import com.treats.euc.pdf.PdfGenerator;

public class PdfServlet extends HttpServlet {

	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * response.setContentType("application/pdf"); PdfDocument pdfDoc = new
	 * PdfDocument(new PdfWriter(response.getOutputStream())); Document doc = new
	 * Document(pdfDoc); doc.add(new Paragraph("Hello World")); doc.add(new
	 * Paragraph(new Date().toString())); doc.close(); }
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PdfGenerator pdf = new PdfGenerator();
		// setting some response headers
		response.setHeader("Expires", "0");
		response.setHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
		response.setHeader("Pragma", "public");
		// setting the content type
		response.setContentType("application/pdf");
		// the contentlength
//			response.setContentLength(baos.size());
		// write ByteArrayOutputStream to the ServletOutputStream
		OutputStream os = response.getOutputStream();
//			baos.writeTo(os);
		os.flush();
		os.close();
	}

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 6067021675155015602L;

}
