package com.treats.euc.ui.controller;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
import com.treats.euc.pdf.PdfGenerator;

@RestController
@RequestMapping("/treats-euc/Export")
public class ExportControllerPdf {

	@RequestMapping("/getPDF")
	protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, DocumentException, MessagingException {
        // Get the text that will be added to the PDF
        String text = request.getParameter("text");
        if (text == null || text.trim().length() == 0) {
            text = "You didn't enter any text.";
        }
        
        PdfGenerator pdfGen = new PdfGenerator();
                
        //ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //pdfGen.setPdfContent("<html><body> This is my Project </body></html>");
        //baos = pdfGen.generatePdf();
        
        ArrayList<String> PdfHtmlList = new ArrayList();
        PdfHtmlList.add("<html><body> This is my Project </body></html>");
        PdfHtmlList.add("<html><body> This is my Project 2 </body></html>");
        
        pdfGen.generatePdf(PdfHtmlList, request, response);
        
/*        // setting some response headers
        response.setHeader("Expires", "0");
        response.setHeader("Cache-Control",
                "must-revalidate, post-check=0, pre-check=0");
        response.setHeader("Pragma", "public");
        // setting the content type
        response.setContentType("application/pdf");
        // the contentlength
        response.setContentLength(baos.size());
        // write ByteArrayOutputStream to the ServletOutputStream
        OutputStream os = response.getOutputStream();
        baos.writeTo(os);
        os.flush();
        os.close();*/
    }

}
