package com.treats.euc.services;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public interface EmailDeliveryServicesInterface {

	/* Set the sender email */
	public void setSender(String username, String password);
	/* Set the sender name */
	public void setSenderName(String senderName) throws UnsupportedEncodingException, MessagingException;
	/* Set the Email Subject */
	public void setSubject(String subject) throws MessagingException;
	/* Set the Email Body Text */
	public void setBody(ArrayList<String> linesOfEmailContent) throws MessagingException;
	/* Add the Email Recipient */
	public void addRecipient(String recipient) throws AddressException, MessagingException;
	/* Add the File Attachment from local path */
	public void addAttachment(String filePath) throws MessagingException;
	/* Add the File Attachment from file object */
	public void addAttachmentFromFileObject(ByteArrayInputStream attachmentFileInputStream, String mimetype, String fileDescription) throws MessagingException, IOException;
	/* Transmit the Email */
	public void send() throws MessagingException;
	
}
