package com.treats.euc.model;

import java.io.Serializable;
import java.util.UUID;

public class DataSource implements Serializable {

	private static final long serialVersionUID = 5463678337418141651L;
	
	private UUID id;
	private String sourceSystem;
	private String dbTable;
	private String dbField;
	
	DataSource(){
		id = UUID.randomUUID();
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getSourceSystem() {
		return sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public String getDbTable() {
		return dbTable;
	}
	public void setDbTable(String dbTable) {
		this.dbTable = dbTable;
	}
	public String getDbField() {
		return dbField;
	}
	public void setDbField(String dbField) {
		this.dbField = dbField;
	}
	
}
