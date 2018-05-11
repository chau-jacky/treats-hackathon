package com.treats.euc.pdf;

import java.util.Date;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;

public class PdfGenerator {
/*	private static Font catFont = new Font(Font.FontFamily.HELVETICA, 28, Font.BOLD);
	private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 28, Font.NORMAL, BaseColor.RED);
	private static Font greemFont = new Font(Font.FontFamily.HELVETICA, 28, Font.NORMAL, BaseColor.GREEN);
	
	private static Font time_Font = new Font(Font.FontFamily.HELVETICA, 12, Font.ITALIC);
	private static Font chaptor_Pass_Font = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
	private static Font chaptor_Fail_Font = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD, BaseColor.RED);
	
	private static Font normal_Font = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);
	private static Font normal_Red_Font = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.RED);
	private static Font normal_Bold_Red_Font = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD, BaseColor.RED);
*/		
	static Chapter catPart;
	static Section subCatPart;
	
	static void addMetaData(Document document, String title) {
		document.addTitle(title);
		document.addSubject(title);
		document.addKeywords(title);
		document.addAuthor(System.getProperty("user.name"));
		document.addCreator(System.getProperty("user.name"));
		
	}
	
	
	
	
}
