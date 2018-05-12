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
		DataSource ds1 = new DataSource();
		ds1.setSourceSystem("TREATS");
		ds1.setDbTable("MPESPTP");
		ds1.setDbField("TADLNO");
		arrayds1.add(ds1);
		DataSource ds2 = new DataSource();
		ds2.setSourceSystem("TREATS");
		ds2.setDbTable("MPEFWDP");
		ds2.setDbField("TCDLNO");
		arrayds1.add(ds2);
		dt1.setDataSource(arrayds1);
		listDocumentTemplate.add(dt1);
		
		DocumentTemplate dt2 = new DocumentTemplate();
		ArrayList<DataSource> arrayds2 = new ArrayList<DataSource>();
		dt2.setDescription("Document Template 002");
		dt2.setDocTemplate("Hello World 002");
		DataSource ds3 = new DataSource();
		ds3.setSourceSystem("TREATS");
		ds3.setDbTable("MPESPTP");
		ds3.setDbField("TADLNO");
		arrayds2.add(ds3);
		DataSource ds4 = new DataSource();
		ds4.setSourceSystem("TREATS");
		ds4.setDbTable("MPEFWDP");
		ds4.setDbField("TCDLNO");
		arrayds2.add(ds4);
		dt2.setDataSource(arrayds2);
		listDocumentTemplate.add(dt2);
		
		DocumentTemplate dt3 = new DocumentTemplate();
		ArrayList<DataSource> arrayds3 = new ArrayList<DataSource>();
		dt3.setDescription("Document Template 003");
		dt3.setDocTemplate("Hello World 003");
		DataSource ds5 = new DataSource();
		ds5.setSourceSystem("TREATS");
		ds5.setDbTable("MPESPTP");
		ds5.setDbField("TADLNO");
		arrayds3.add(ds5);
		DataSource ds6 = new DataSource();
		ds6.setSourceSystem("TREATS");
		ds6.setDbTable("MPEFWDP");
		ds6.setDbField("TCDLNO");
		arrayds3.add(ds6);
		dt3.setDataSource(arrayds3);	
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
