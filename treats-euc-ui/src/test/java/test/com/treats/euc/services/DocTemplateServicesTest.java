package test.com.treats.euc.services;

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
		HELPER.stop(Duration.ofMinutes(1));
	}

	@Test
	public void testAdd() {
		DocTemplateServices docTemplateServices = new DocTemplateServices();

		DataSource ds1 = new DataSource();
		ds1.setSourceSystem("TREATS");
		ds1.setDbTable("MPESPTP");
		ds1.setDbField("TADLNO");

		DataSource ds2 = new DataSource();
		ds2.setSourceSystem("TREATS");
		ds2.setDbTable("MPEFWDP");
		ds2.setDbField("TCDLNO");

		ArrayList<DataSource> listDataSource = new ArrayList<DataSource>();
		listDataSource.add(ds1);
		listDataSource.add(ds2);

		DocumentTemplate dt1 = new DocumentTemplate();
		dt1.setDescription("Document Template 001");
		dt1.setDocTemplate("template details");
		dt1.setDataSource(listDataSource);

		docTemplateServices.addDocTemplate(dt1);

	}

}
