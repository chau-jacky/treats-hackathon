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

	private ArrayList<DocumentTemplate> listDocumentTemplate;
	
	DocTemplateServicesMemory(){
		DocumentTemplate dt1 = new DocumentTemplate();
		ArrayList<DataSource> arrayds = new ArrayList();
		
		dt1.setDescription("Document Template 001");
		dt1.setDocTemplate("Hello World");
		DataSource ds1 = new DataSource();
		ds1.setSourceSystem("TREATS");
		ds1.setDbTable("MPESPTP");
		ds1.setDbField("TADLNO");
		arrayds.add(ds1);
		
		
		dt1.setDataSource(arrayds);
		
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
	
}
