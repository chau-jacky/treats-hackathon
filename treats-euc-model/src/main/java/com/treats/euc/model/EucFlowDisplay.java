package com.treats.euc.model;

import java.util.UUID;

public class EucFlowDisplay {

	private UUID id;
	private String name;
	private String description;
	private String dataSource;
	private String dataTable;
	private String templateName;
	private String outputFormat;	// EXCEL or PDF
	private String outputMedium; 	// SERVER or EMAIL
	private String schedule;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDataSource() {
		return dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	public String getDataTable() {
		return dataTable;
	}
	public void setDataTable(String dataTable) {
		this.dataTable = dataTable;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
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
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	
}
