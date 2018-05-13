package test.com.treats.euc.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.testing.LocalDatastoreHelper;
import com.treats.euc.model.DataSource;
import com.treats.euc.model.DocumentTemplate;
import com.treats.euc.services.DocTemplateServices;
import com.treats.euc.services.DocTemplateServicesDataStore;

import org.threeten.bp.Duration;

public class DocTemplateServicesTest {

	private static final LocalDatastoreHelper HELPER = LocalDatastoreHelper.create(1.0);
	private Datastore datastore;

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@BeforeClass
	public static void beforeClass() throws IOException, InterruptedException {
		HELPER.start();
	}

	@Before
	public void setUp() {
		datastore = HELPER.getOptions().toBuilder().build().getService();
	}

	@AfterClass
	public static void afterClass() throws IOException, InterruptedException, TimeoutException {
		//HELPER.stop(Duration.ofMinutes(1));
	}

	@Test
	public void testAdd() throws FileNotFoundException, IOException {
		DocTemplateServicesDataStore docTemplateServices = new DocTemplateServicesDataStore();

		ArrayList<String> fields2 = new ArrayList<String>();
		fields2.add("tradeid");
		fields2.add("country");
		
		DocumentTemplate dt1 = new DocumentTemplate();
		dt1.setDescription("Document Template 001");
		dt1.setDocTemplate("template details");
		dt1.setDataSystem("hk_treats");
		dt1.setDataTable("trade_info");
		dt1.setDataFields(fields2);

		docTemplateServices.addDocTemplate(dt1);
		System.out.println("id created : " + dt1.getIdString());

		docTemplateServices.deleteDocTemplate(dt1.getIdString());
		System.out.println("id deteled: " + dt1.getIdString());
		
		System.out.println(docTemplateServices.getDocumentTemplate("613bb7d9-ff7b-4245-a8fc-6a78b0d8d1f6").getIdString());
		
		
	}

}
