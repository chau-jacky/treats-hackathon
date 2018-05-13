package com.treats.euc.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

import com.google.cloud.Timestamp;
import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.FullEntity;
import com.google.cloud.datastore.Key;
import com.google.cloud.datastore.KeyFactory;
import com.google.cloud.datastore.ListValue;
import com.google.cloud.datastore.Query;
import com.google.cloud.datastore.StringValue;
import com.google.cloud.datastore.StructuredQuery.OrderBy;
import com.google.cloud.datastore.Transaction;
import com.treats.euc.model.DataSource;
import com.treats.euc.model.DocumentTemplate;

public class DocTemplateServicesMemory implements DocTemplateServicesInterface {

	private static ArrayList<DocumentTemplate> listDocumentTemplate;
	
	public DocTemplateServicesMemory(){
		
		listDocumentTemplate = new ArrayList<DocumentTemplate>();
		
		DocumentTemplate dt1 = new DocumentTemplate();
		ArrayList<DataSource> arrayds1 = new ArrayList<DataSource>();
		dt1.setDescription("Document Template 001");
		dt1.setDocTemplate("Hello World 001");
		dt1.setDataSystem("hk_treats");
		dt1.setDataTable("trade_info");

		ArrayList<String> fields1 = new ArrayList<String>();
		fields1.add("tradeid");
		fields1.add("country");
		dt1.setDataFields(fields1);
		
		listDocumentTemplate.add(dt1);
		
		DocumentTemplate dt2 = new DocumentTemplate();
		ArrayList<DataSource> arrayds2 = new ArrayList<DataSource>();
		dt2.setDescription("Document Template 002");
		dt2.setDocTemplate("Hello World 002");
		dt2.setDataSystem("hk_treats");
		dt2.setDataTable("trade_info");

		ArrayList<String> fields2 = new ArrayList<String>();
		fields2.add("tradeid");
		fields2.add("country");
		dt2.setDataFields(fields2);
		
		listDocumentTemplate.add(dt2);
		
		DocumentTemplate dt3 = new DocumentTemplate();
		ArrayList<DataSource> arrayds3 = new ArrayList<DataSource>();
		dt3.setDescription("Document Template 003");
		dt3.setDocTemplate("Hello World 003");
		dt3.setDataSystem("hk_treats");
		dt3.setDataTable("trade_info");

		ArrayList<String> fields3 = new ArrayList<String>();
		fields3.add("tradeid");
		fields3.add("country");
		dt3.setDataFields(fields3);
		
		listDocumentTemplate.add(dt3);
	}

	@Override
	public ArrayList<DocumentTemplate> getListDocumentTemplate() {
		return listDocumentTemplate;
	}

	@Override
	public DocumentTemplate getDocumentTemplate(String id) {
		for (Iterator<DocumentTemplate> iterator = listDocumentTemplate.iterator(); iterator.hasNext();) {
			DocumentTemplate documentTemplate = (DocumentTemplate) iterator.next();
			
			if (id.equals(documentTemplate.getIdString())){
				return documentTemplate;
			}
		}
		return null;
	}

	@Override
	public void addDocTemplate(DocumentTemplate docTemplate) {
		listDocumentTemplate.add(docTemplate);
	}

	@Override
	public void deleteDocTemplate(String id) {
		for (Iterator<DocumentTemplate> iterator = listDocumentTemplate.iterator(); iterator.hasNext();) {
			DocumentTemplate documentTemplate = (DocumentTemplate) iterator.next();
			
			if (id.equals(documentTemplate.getIdString())){
				listDocumentTemplate.remove(documentTemplate);
			}
		}
	}
	
}
