package com.treats.euc.model;

import java.util.UUID;

public class EucFlow {

	private UUID id;
	private String name;
	private String description;
	private UUID documentTemplateID;
	private String filer;
	private String outputFormat;	// EXCEL or PDF
	private String outputMedium; 	// SERVER or EMAIL
	private String emailAddress;
	private boolean isScheduled;
	private EucSchedule eucSchedule;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFiler() {
		return filer;
	}

	public void setFiler(String filer) {
		this.filer = filer;
	}

	public String getOutputFormat() {
		return outputFormat;
	}

	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}

	public String getOutputMedium() {
		return outputMedium;
	}

	public void setOutputMedium(String outputMedium) {
		this.outputMedium = outputMedium;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public boolean isScheduled() {
		return isScheduled;
	}

	public void setScheduled(boolean isScheduled) {
		this.isScheduled = isScheduled;
	}

	public EucFlow(){
		id = UUID.randomUUID();
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getIdString() {
		return id.toString();
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public UUID getDocumentTemplateID() {
		return documentTemplateID;
	}
	
	public void setDocumentTemplateID(UUID documentTemplateID) {
		this.documentTemplateID = documentTemplateID;
	}
	
	public EucSchedule getEucSchedule() {
		return eucSchedule;
	}
	
	public void setEucSchedule(EucSchedule eucSchedule) {
		this.eucSchedule = eucSchedule;
	}
	
}
