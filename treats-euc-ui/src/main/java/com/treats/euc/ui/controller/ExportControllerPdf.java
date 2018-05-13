package com.treats.euc.ui.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.DocumentException;
import com.treats.euc.pdf.PdfGenerator;

@RestController
@RequestMapping("/treats-euc/Export")
public class ExportControllerPdf {

	@RequestMapping("/ExportPdf")
	public HttpServletResponse sendPDFEmail() throws DocumentException, IOException, MessagingException {

		PdfGenerator pdf = new PdfGenerator();
		pdf.setPdfContent("<html><body> This is my Project </body></html>");

		ByteArrayOutputStream baos = pdf.generatePdf();
		// EmailDeliveryServices sender = new EmailDeliveryServices();
		// sender.sendEmailWithPdfAndDefaultSetup(baos);

		HttpServletResponse response = null;

		// setting some response headers
		response.setHeader("Expires", "0");
		response.setHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
		response.setHeader("Pragma", "public");
		// setting the content type
		response.setContentType("application/pdf");
		// the contentlength
		// response.setContentLength(baos.size());
		// write ByteArrayOutputStream to the ServletOutputStream
		OutputStream os = response.getOutputStream();
		// baos.writeTo(os);
		os.flush();
		os.close();

		return response;
	}

}

