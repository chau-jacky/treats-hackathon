package com.treats.euc.model;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class DocumentTemplate implements Serializable {
	
	private static final long serialVersionUID = 7829848504882295752L;
	
	private UUID id;
	private String description;
	private String docTemplate;
	private List<DataSource> dataSource;
	
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
	public String getDocTemplate() {
		return docTemplate;
	}
	public void setDocTemplate(String docTemplate) {
		this.docTemplate = docTemplate;
	}
	public List<DataSource> getDataSource() {
		return dataSource;
	}
	public void setDataSource(List<DataSource> dataSource) {
		this.dataSource = dataSource;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
