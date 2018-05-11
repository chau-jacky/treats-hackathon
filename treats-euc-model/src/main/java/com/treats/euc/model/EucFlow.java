package com.treats.euc.model;

import java.util.UUID;

public class EucFlow {

	private UUID id;
	private String description;
	private UUID documentTemplateID;
	private String sql;  // select tadlno from mpesptp
	private String output; //Email or local hdd
	private EucSchedule eucSchedule;
	
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
	
	public String getSql() {
		return sql;
	}
	
	public void setSql(String sql) {
		this.sql = sql;
	}
	
	public String getOutput() {
		return output;
	}
	
	public void setOutput(String output) {
		this.output = output;
	}
	
	public EucSchedule getEucSchedule() {
		return eucSchedule;
	}
	
	public void setEucSchedule(EucSchedule eucSchedule) {
		this.eucSchedule = eucSchedule;
	}
	
}
