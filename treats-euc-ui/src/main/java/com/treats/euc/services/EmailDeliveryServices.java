package com.treats.euc.services;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import java.io.ByteArrayOutputStream;
import com.itextpdf.text.DocumentException;

public class EmailDeliveryServices implements EmailDeliveryServicesInterface {

	private static String protocol = "smtp";
	private String username;
	private String password;
	private Session session;
	private Message message;
	private Multipart multipart;

	/* Constructor */
	public EmailDeliveryServices() {
		this.multipart = new MimeMultipart();
	}
	
	public EmailDeliveryServices(String username, String password) {
		this.username = username;
		this.password = password;
		this.session = getSession();
		this.message = new MimeMessage(session);
		this.multipart = new MimeMultipart();
	}

	/* Retrieve the mail server connection details */ 
	private Properties getMailServerProperties() {
		Properties properties = System.getProperties();
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", protocol + ".gmail.com");
		properties.put("mail.smtp.user", username);
		properties.put("mail.smtp.password", password);
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		return properties;
	}
	
	/* Retrieve the connection session */
	private Session getSession() {
		Properties properties = getMailServerProperties();
		Session session = Session.getDefaultInstance(properties);
		return session;
	}
	
	private BodyPart getFileBodyPart(String filePath) throws MessagingException {
		BodyPart messageBodyPart = new MimeBodyPart();
		DataSource dataSource = new FileDataSource(filePath);
		messageBodyPart.setDataHandler(new DataHandler(dataSource));
		messageBodyPart.setFileName(filePath);
		return messageBodyPart;
	}
	
	@Override
	/* Set the sender details */
	public void setSender(String username, String password) {
		this.username = username;
		this.password = password;
		this.session = getSession();
		this.message = new MimeMessage(session);
	}
	
	@Override
	/* Set the sender details */
	public void setSenderName(String senderName) throws UnsupportedEncodingException, MessagingException {
		message.setFrom(new InternetAddress("EmailSenderName", senderName));
	}
	
	@Override
	/* Set the Email Subject */
	public void setSubject(String subject) throws MessagingException {
		message.setSubject(subject);
	}

	@Override
	/* Set the Email Body Text */
	public void setBody(ArrayList<String> linesOfEmailContent) throws MessagingException {
		BodyPart messageBodyPart = new MimeBodyPart();
		String emailBodyText = new String();
		for (Iterator<String> iterator = linesOfEmailContent.iterator(); iterator.hasNext();) {
			emailBodyText= emailBodyText.concat((String) iterator.next());
		}
		messageBodyPart.setText(emailBodyText);
		multipart.addBodyPart(messageBodyPart);

		message.setContent(multipart);
	}

	/* Add the Email Recipient */
	@Override
	public void addRecipient(String recipient) throws AddressException, MessagingException {
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
	}
	
	/* Add the File Attachment from local path */
	@Override
	public void addAttachment(String filePath) throws MessagingException {
		BodyPart messageBodyPart = getFileBodyPart(filePath);
		multipart.addBodyPart(messageBodyPart);
		message.setContent(multipart);
	}
	
	/* Add the File Attachment from file object */
	@Override
	public void addAttachmentFromFileObject(ByteArrayInputStream attachmentFileInputStream, String mimetype, String fileDescription) throws MessagingException, IOException {
        // byte[] bytes = file.toByteArray();
		DataSource dataSource = new ByteArrayDataSource(attachmentFileInputStream, mimetype);
		//String mimetype = URLConnection.guessContentTypeFromStream(new BufferedInputStream(attachmentFileInputStream));
		
        MimeBodyPart fileBodyPart = new MimeBodyPart();
        fileBodyPart.setDataHandler(new DataHandler(dataSource));
        fileBodyPart.setFileName(fileDescription);
        
		multipart.addBodyPart(fileBodyPart);
		message.setContent(multipart);
	}
	
	/* Transmit the Email */
	@Override
	public void send() throws MessagingException {
		Transport transport = session.getTransport(protocol);
		transport.connect(username, password);
		transport.sendMessage(message, message.getAllRecipients());

		transport.close();
	}
	
	public void sendEmailWithPdfAndDefaultSetup(ByteArrayOutputStream baos) throws MessagingException, IOException, DocumentException {
		this.setSender("treats.hackathon@gmail.com", "hackathon2018");
		this.setSenderName("LION Securities - 獅子證券");
		this.addRecipient("treats.hackathon@gmail.com");
		this.setSubject("LION Securities - Trading Services eStatement 獅子交易服務電子結單 14May2018");
		ArrayList<String> emailBodyText = new ArrayList<String>();
		emailBodyText.add("Dear Customer, \n\n");
		emailBodyText.add("Thank you for using LION trading services. ");
		emailBodyText.add("The lastest eStatement containing information on your recent transaction with us ");
		emailBodyText.add("has been attached in this email. \n\n ");
		emailBodyText.add("Please check the statement and report to us if there is any error or discrepancy. \n\n");
		emailBodyText.add("For more information: \n");
		emailBodyText.add("Should you have any question or require further information, ");
		emailBodyText.add("please contact our customer service hotline at (852) 2345 5678 ");
		emailBodyText.add("(press 1,6,0 for Cantonese, 2,6,0 for Englsh and 3,6,0 for Mandarin). \n\n");
		emailBodyText.add("*** Please do not reply to this email *** \n\n");
		this.setBody(emailBodyText);
		String mimeType = "application/pdf";
		String fileDescription = "14May2018 eStatement.pdf";
		ByteArrayInputStream fileInputStream = new ByteArrayInputStream(baos.toByteArray()); 
		this.addAttachmentFromFileObject(fileInputStream, mimeType, fileDescription);
		this.send();
	}
	
	public void sendEmailWithPdfAndDefaultSetup(ByteArrayOutputStream baos, String destinationEmail) throws MessagingException, IOException, DocumentException {
		this.setSender("treats.hackathon@gmail.com", "hackathon2018");
		this.setSenderName("LION Securities - 獅子證券");
		this.addRecipient(destinationEmail);
		this.setSubject("LION Securities - Trading Services eStatement 獅子交易服務電子結單 14May2018");
		ArrayList<String> emailBodyText = new ArrayList<String>();
		emailBodyText.add("Dear Customer, \n\n");
		emailBodyText.add("Thank you for using LION trading services. ");
		emailBodyText.add("The lastest eStatement containing information on your recent transaction with us ");
		emailBodyText.add("has been attached in this email. \n\n ");
		emailBodyText.add("Please check the statement and report to us if there is any error or discrepancy. \n\n");
		emailBodyText.add("For more information: \n");
		emailBodyText.add("Should you have any question or require further information, ");
		emailBodyText.add("please contact our customer service hotline at (852) 2345 5678 ");
		emailBodyText.add("(press 1,6,0 for Cantonese, 2,6,0 for Englsh and 3,6,0 for Mandarin). \n\n");
		emailBodyText.add("*** Please do not reply to this email *** \n\n");
		this.setBody(emailBodyText);
		String mimeType = "application/pdf";
		String fileDescription = "14May2018 eStatement.pdf";
		ByteArrayInputStream fileInputStream = new ByteArrayInputStream(baos.toByteArray()); 
		this.addAttachmentFromFileObject(fileInputStream, mimeType, fileDescription);
		this.send();
	}
	
	public void sendEmailWithExcelAndDefaultSetup(ByteArrayOutputStream baos) throws MessagingException, IOException {
		this.setSender("treats.hackathon@gmail.com", "hackathon2018");
		this.setSenderName("LION Securities - 獅子證券");
		this.addRecipient("treats.hackathon@gmail.com");
		this.setSubject("LION Securities - Data Extraction Services 獅子證券資料擷取服務 14May2018");
		ArrayList<String> emailBodyText = new ArrayList<String>();
		emailBodyText.add("Dear Customer, \n\n");
		emailBodyText.add("Thank you for using LION trading services. ");
		emailBodyText.add("The lastest Excel containing transaction data that you request ");
		emailBodyText.add("has been attached in this email. \n\n ");
		emailBodyText.add("Please check the statement and report to us if there is any error or discrepancy. \n\n");
		emailBodyText.add("For more information: \n");
		emailBodyText.add("Should you have any question or require further information, ");
		emailBodyText.add("please contact our customer service hotline at (852) 2345 5678 ");
		emailBodyText.add("(press 1,6,0 for Cantonese, 2,6,0 for Englsh and 3,6,0 for Mandarin). \n\n");
		emailBodyText.add("*** Please do not reply to this email *** \n\n");
		this.setBody(emailBodyText);
		String mimeType = "application/vnd.ms-excel";
		String fileDescription = "14May2018 Transaction Data.xls";
		ByteArrayInputStream fileInputStream = new ByteArrayInputStream(baos.toByteArray()); 
		this.addAttachmentFromFileObject(fileInputStream, mimeType, fileDescription);
		this.send();
	}
	
	public void sendEmailWithExcelAndDefaultSetup(ByteArrayOutputStream baos, String destinationEmail) throws MessagingException, IOException {
		this.setSender("treats.hackathon@gmail.com", "hackathon2018");
		this.setSenderName("LION Securities - 獅子證券");
		this.addRecipient(destinationEmail);
		//System.out.println(destinationEmail);
		this.setSubject("LION Securities - Data Extraction Services 獅子證券資料擷取服務 14May2018");
		ArrayList<String> emailBodyText = new ArrayList<String>();
		emailBodyText.add("Dear Customer, \n\n");
		emailBodyText.add("Thank you for using LION trading services. ");
		emailBodyText.add("The lastest Excel containing transaction data that you request ");
		emailBodyText.add("has been attached in this email. \n\n ");
		emailBodyText.add("Please check the statement and report to us if there is any error or discrepancy. \n\n");
		emailBodyText.add("For more information: \n");
		emailBodyText.add("Should you have any question or require further information, ");
		emailBodyText.add("please contact our customer service hotline at (852) 2345 5678 ");
		emailBodyText.add("(press 1,6,0 for Cantonese, 2,6,0 for Englsh and 3,6,0 for Mandarin). \n\n");
		emailBodyText.add("*** Please do not reply to this email *** \n\n");
		this.setBody(emailBodyText);
		String mimeType = "application/vnd.ms-excel";
		String fileDescription = "14May2018 Transaction Data.xls";
		ByteArrayInputStream fileInputStream = new ByteArrayInputStream(baos.toByteArray()); 
		this.addAttachmentFromFileObject(fileInputStream, mimeType, fileDescription);
		this.send();
	}

}
