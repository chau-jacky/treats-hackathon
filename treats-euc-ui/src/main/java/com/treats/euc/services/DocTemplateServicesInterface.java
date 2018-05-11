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

public interface DocTemplateServicesInterface {

	public ArrayList<DocumentTemplate> getListDocumentTemplate();
	
	public DocumentTemplate getDocumentTemplate(String id);
	
	public void addDocTemplate(DocumentTemplate docTemplate);
	
}
