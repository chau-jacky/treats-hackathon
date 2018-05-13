package com.treats.euc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

public class DocumentTemplate implements Serializable {
	
	private static final long serialVersionUID = 7829848504882295752L;
	
	private UUID id;
	private String description;
	private String docTemplate;
	private String dataSystem;
	private String dataTable;
	private ArrayList<String> dataFields;
	
	public void setDataFields(ArrayList<String> dataFields) {
		this.dataFields = dataFields;
	}
	public String getDataSystem() {
		return dataSystem;
	}
	public void setDataSystem(String dataSystem) {
		this.dataSystem = dataSystem;
	}
	public String getDataTable() {
		return dataTable;
	}
	public void setDataTable(String dataTable) {
		this.dataTable = dataTable;
	}
	public ArrayList<String> getDataFields() {
		return dataFields;
	}
	public DocumentTemplate() {
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
	public void setId(String id) {
		this.id = UUID.fromString(id);
	}
	public String getDocTemplate() {
		return docTemplate;
	}
	public void setDocTemplate(String docTemplate) {
		this.docTemplate = docTemplate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
