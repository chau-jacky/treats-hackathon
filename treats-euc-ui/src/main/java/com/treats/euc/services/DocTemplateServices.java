package com.treats.euc.services;

import java.util.Iterator;

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

public class DocTemplateServices {

	/*
	private static String docTemplateKind = "DocTemplate";
	private static String dataSoureKind = "DataSource";

	private final Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
	private final KeyFactory docTemplateFactory = datastore.newKeyFactory().setKind(docTemplateKind);
	private final KeyFactory dataSourceFactory = datastore.newKeyFactory().setKind(dataSoureKind);

	public void addDocTemplate(DocumentTemplate documentTemplate) {
		Key docKey = datastore.newKeyFactory().setKind(docTemplateKind).newKey(documentTemplate.getIdString());
   
		ListValue.Builder dataSourceList = ListValue.newBuilder();
		for (Iterator<DataSource> iterator = documentTemplate.getDataSource().iterator(); iterator.hasNext();) {
			DataSource dataSource = (DataSource) iterator.next();
			Key dataSourceKey = datastore.newKeyFactory().setKind(dataSoureKind).newKey(dataSource.getIdString());
			FullEntity dataSourceEntity = FullEntity.newBuilder(dataSourceKey)
					.set("sourceSystem", StringValue.newBuilder(dataSource.getSourceSystem()).build())
					.set("dbTable", StringValue.newBuilder(dataSource.getDbTable()).build())
					.set("dbField", StringValue.newBuilder(dataSource.getDbField()).build())
					.build();
			dataSourceList.addValue(dataSourceEntity);
		}

		Entity docTemplate = Entity.newBuilder(docKey)
				.set("description", StringValue.newBuilder(documentTemplate.getDescription()).build())
				.set("template",StringValue.newBuilder(documentTemplate.getDocTemplate()).setExcludeFromIndexes(true).build())
				.set("datasource", dataSourceList.build())
				.set("created", Timestamp.now()).build();
		datastore.put(docTemplate);
	}
	*/
}
