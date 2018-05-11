package com.treats.euc.services;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64.OutputStream;

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
	public void addRecipient(String recipient) throws AddressException, MessagingException {
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
	}
	
	/* Add the Email Attachment */
	public void addAttachment(String filePath) throws MessagingException {
		BodyPart messageBodyPart = getFileBodyPart(filePath);
		multipart.addBodyPart(messageBodyPart);
		message.setContent(multipart);
	}
	
	/* Add the Email Attachment */
	/* 
	public void addAttachmentFromFileObject(ByteArrayInputStream file, String mimeType, String fileDescription) throws MessagingException {
        // byte[] bytes = file.toByteArray();
		DataSource dataSource = new ByteArrayDataSource(bytes, "application/pdf");
        MimeBodyPart fileBodyPart = new MimeBodyPart();
        fileBodyPart.setDataHandler(new DataHandler(dataSource));
        fileBodyPart.setFileName(fileDescription);
        
		multipart.addBodyPart(fileBodyPart);
		message.setContent(multipart);
	}
	*/
	
	/* Transmit the Email */
	public void send() throws MessagingException {
		Transport transport = session.getTransport(protocol);
		transport.connect(username, password);
		transport.sendMessage(message, message.getAllRecipients());

		transport.close();
	}

}
