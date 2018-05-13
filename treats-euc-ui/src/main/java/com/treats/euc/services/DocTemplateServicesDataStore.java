package com.treats.euc.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.cloud.Timestamp;
import com.google.cloud.bigquery.BigQueryOptions;
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
import com.google.cloud.datastore.Value;
import com.treats.euc.model.DataSource;
import com.treats.euc.model.DocumentTemplate;
import com.treats.euc.ui.TreatsConstants;

public class DocTemplateServicesDataStore implements DocTemplateServicesInterface {

	private static String docTemplateKind = "DocTemplate";
	private static String dataSoureKind = "DataSource";
	
	private static Datastore datastore;
	private static KeyFactory docTemplateFactory;
	private static KeyFactory dataSourceFactory;

	public DocTemplateServicesDataStore() throws FileNotFoundException, IOException{
		
		GoogleCredentials credentials;
		File credentialsPath = new File("resources/treats-service-account.json");
		try (FileInputStream serviceAccountStream = new FileInputStream(credentialsPath)) {
			credentials = ServiceAccountCredentials.fromStream(serviceAccountStream);
		}

		datastore = DatastoreOptions.newBuilder().setProjectId(TreatsConstants.CLOUD_PROJECT_ID).setCredentials(credentials).build().getService();	
		docTemplateFactory = datastore.newKeyFactory().setKind(docTemplateKind);
		dataSourceFactory = datastore.newKeyFactory().setKind(dataSoureKind);

	}

	@Override
	public ArrayList<DocumentTemplate> getListDocumentTemplate() {
		ArrayList<DocumentTemplate> listTemplate = new ArrayList<DocumentTemplate>();
		
	    Query<Entity> query =Query.newEntityQueryBuilder().setKind(docTemplateKind).build();
	    Iterator<Entity> iterator = datastore.run(query);
	    
	    while (iterator.hasNext()) {
	    	listTemplate.add(entityToTemplate(iterator.next()));
		}
		
		return listTemplate;
	}

	@Override
	public DocumentTemplate getDocumentTemplate(String id) {
		
		System.out.println("Get Doc Template by ID : " + id);
		
		Key docKey = datastore.newKeyFactory().setKind(docTemplateKind).newKey(id);
		
		return entityToTemplate(datastore.get(docKey));
	}

	@Override
	public void addDocTemplate(DocumentTemplate docTemplate) {
		datastore.put(templateToEntity(docTemplate));
	}

	@Override
	public void deleteDocTemplate(String id) {
		Key docKey = datastore.newKeyFactory().setKind(docTemplateKind).newKey(id);
		datastore.delete(docKey);
	}
	
	public DocumentTemplate entityToTemplate(Entity entity) {
		
//		System.out.println("entityToTemplate");
		DocumentTemplate docTemplate = new DocumentTemplate();
		
//		System.out.println("entity : " + entity.toString());
//		System.out.println("key : " + entity.getKey().getName());
		
		docTemplate.setId(entity.getKey().getName());
		
//		System.out.println("description: " + entity.getString("description"));
		docTemplate.setDescription(entity.getString("description"));
		docTemplate.setDocTemplate(entity.getString("template"));
		docTemplate.setDataSystem(entity.getString("dataSystem"));
		docTemplate.setDataTable(entity.getString("dataTable"));
		
//		System.out.println("dataFields: " + entity.getList("dataFields"));
//		System.out.println("dataFields size: " + entity.getList("dataFields").size());
		
		List<? extends Value<?>> list = entity.getList("dataFields");
		ArrayList<String> listFields = new ArrayList<String>();
		
		for (Value<?> string : list) {
//			System.out.println("field string : " + string.get().toString());
			listFields.add(string.get().toString());
		}
		
		docTemplate.setDataFields(listFields); 
		
		return docTemplate;
	}
	
	public Entity templateToEntity(DocumentTemplate docTemplate) {
		Key docKey = datastore.newKeyFactory().setKind(docTemplateKind).newKey(docTemplate.getIdString());

		ListValue.Builder listBuilder = ListValue.newBuilder();
		for (Iterator<String> iterator = docTemplate.getDataFields().iterator(); iterator.hasNext();) {
			String field = iterator.next();
			listBuilder.addValue(field);
		}
		
		Entity entity = Entity.newBuilder(docKey)
				.set("description", StringValue.newBuilder(docTemplate.getDescription()).build())
				.set("template",StringValue.newBuilder(docTemplate.getDocTemplate()).setExcludeFromIndexes(true).build())
				.set("dataSystem", StringValue.newBuilder(docTemplate.getDataSystem()).build())
				.set("dataTable", StringValue.newBuilder(docTemplate.getDataTable()).build())
				.set("dataFields", listBuilder.build())
				.set("created", Timestamp.now())
				.build();

		return entity;
	}
	
}
