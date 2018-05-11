package test.com.treats.euc.services;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.mail.MessagingException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.junit.Test;

import com.treats.euc.services.EmailDeliveryServices;

public class EmailDeliveryServicesTest {

	@Test
	public void testEmailSend() throws MessagingException, IOException {
		EmailDeliveryServices sender = new EmailDeliveryServices();
		sender.setSender("treats.hackathon@gmail.com", "hackathon2018");
		sender.setSenderName("TREATS Hackathon Team");
		sender.addRecipient("treats.hackathon@gmail.com");
		sender.setSubject("Java Email Testing Example!");
		ArrayList<String> emailBodyText = new ArrayList<String>();
		emailBodyText.add("RFC 822 header fields must contain only US-ASCII characters. \n");
		emailBodyText.add("MIME allows non ASCII characters to be present in certain portions of certain headers, by encoding those characters. \n");
		emailBodyText.add("RFC 2047 specifies the rules for doing this. \n");
		emailBodyText.add("The MimeUtility class provided in this package can be used to to achieve this. ");
		//sender.setBody("Java Email Testing Example...");
		sender.setBody(emailBodyText);
		sender.addAttachment("/Users/simonchau/Downloads/LTN20180511497_C.pdf");
		//File file = new File("/Users/simonchau/Downloads/LTN20180511497_C.pdf"); 
	    //PDDocument document = PDDocument.load(file); 

		sender.send();
	}
}
