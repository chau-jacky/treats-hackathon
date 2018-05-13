package com.treats.euc.services;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import com.treats.euc.model.EucFlow;
import com.treats.euc.model.EucSchedule;

public class EucFlowServicesMemory implements EucFlowServicesInterface {

	private static ArrayList<EucFlow> listEucFlow = new ArrayList<EucFlow>();;

	public EucFlowServicesMemory() {
		if (listEucFlow.size() == 0) {
			
			EucFlow eucFlow5 = new EucFlow();
			eucFlow5.setName("Daily Workflow");
			eucFlow5.setDescription("Daily Customer Report - PDF");
			eucFlow5.setDocumentTemplateID(UUID.fromString("75b7f099-bea4-4414-89d9-a176506d6482"));
			eucFlow5.setFiler("WHERE TradeID IN ('SPT181230003', 'SPT181230001')");
			eucFlow5.setOutputFormat("PDF");
			eucFlow5.setOutputMedium("EMAIL");
			eucFlow5.setEmailAddress("chau.jacky@gmail.com");
			EucSchedule eucSchedule5 = new EucSchedule();
			LocalTime executeTime5 = LocalTime.of(11, 58, 59);
			eucSchedule5.setExectueTime(executeTime5);
			eucSchedule5.setExecuteFrequency("Daily");
			eucSchedule5.setExecuteDayOfWeek("Daily");
			listEucFlow.add(eucFlow5);
			
			EucFlow eucFlow6 = new EucFlow();
			eucFlow6.setName("Daily Workflow");
			eucFlow6.setDescription("Daily Customer Report - EXCEL");
			eucFlow6.setDocumentTemplateID(UUID.fromString("75b7f099-bea4-4414-89d9-a176506d6482"));
			eucFlow6.setFiler("WHERE TradeID IN ('SPT181230003', 'SPT181230001')");
			eucFlow6.setOutputFormat("EXCEL");
			eucFlow6.setOutputMedium("EMAIL");
			eucFlow6.setEmailAddress("chau.jacky@gmail.com");
			EucSchedule eucSchedule6 = new EucSchedule();
			LocalTime executeTime6 = LocalTime.of(11, 58, 59);
			eucSchedule6.setExectueTime(executeTime6);
			eucSchedule6.setExecuteFrequency("Daily");
			eucSchedule6.setExecuteDayOfWeek("Daily");
			listEucFlow.add(eucFlow6);
			
			
			EucFlow eucFlow = new EucFlow();
			eucFlow.setName("Sample Workflow");
			eucFlow.setDescription("Excel output to Email");
			eucFlow.setDocumentTemplateID(UUID.fromString("eb9cac36-d4d2-47ff-9060-cc2131df1c6b"));
			eucFlow.setFiler("WHERE TradeID IN ('SPT181230003', 'SPT181230001')");
			eucFlow.setOutputFormat("EXCEL");
			eucFlow.setOutputMedium("EMAIL");
			EucSchedule eucSchedule = new EucSchedule();
			LocalTime executeTime = LocalTime.of(11, 58, 59);
			eucSchedule.setExectueTime(executeTime);
			eucSchedule.setExecuteFrequency("Once a Week");
			eucSchedule.setExecuteDayOfWeek("Friday");
			listEucFlow.add(eucFlow);

			EucFlow eucFlow4 = new EucFlow();
			eucFlow4.setName("Sample Workflow");
			eucFlow4.setDescription("PDF output to Email");
			eucFlow4.setDocumentTemplateID(UUID.fromString("eb9cac36-d4d2-47ff-9060-cc2131df1c6b"));
			eucFlow4.setFiler("WHERE TradeID IN ('SPT181230003', 'SPT181230001')");
			eucFlow4.setOutputFormat("PDF");
			eucFlow4.setOutputMedium("EMAIL");
			EucSchedule eucSchedule4 = new EucSchedule();
			LocalTime executeTime4 = LocalTime.of(11, 58, 59);
			eucSchedule4.setExectueTime(executeTime4);
			eucSchedule4.setExecuteFrequency("Once a Week");
			eucSchedule4.setExecuteDayOfWeek("Friday");
			listEucFlow.add(eucFlow4);

			EucFlow eucFlow2 = new EucFlow();
			eucFlow2.setName("Sample Workflow");
			eucFlow2.setDescription("EUC Workflow 002");
			eucFlow2.setDocumentTemplateID(UUID.fromString("eb9cac36-d4d2-47ff-9060-cc2131df1c6b"));
			eucFlow2.setFiler("WHERE TradeID = 'SPT181230003'");
			eucFlow2.setOutputFormat("PDF");
			eucFlow2.setOutputMedium("EMAIL");
			EucSchedule eucSchedule2 = new EucSchedule();
			LocalTime executeTime2 = LocalTime.of(11, 58, 59);
			eucSchedule2.setExectueTime(executeTime2);
			eucSchedule2.setExecuteFrequency("Once a Week");
			eucSchedule2.setExecuteDayOfWeek("Friday");
			listEucFlow.add(eucFlow2);

			EucFlow eucFlow3 = new EucFlow();
			eucFlow3.setName("Sample Workflow");
			eucFlow3.setDescription("EUC Workflow 003");
			eucFlow3.setDocumentTemplateID(UUID.fromString("eb9cac36-d4d2-47ff-9060-cc2131df1c6b"));
			eucFlow3.setFiler("WHERE TradeID = 'SPT181230003'");
			eucFlow3.setOutputFormat("EXCEL");
			eucFlow3.setOutputMedium("SERVER");
			EucSchedule eucSchedule3 = new EucSchedule();
			LocalTime executeTime3 = LocalTime.of(11, 58, 59);
			eucSchedule3.setExectueTime(executeTime3);
			eucSchedule3.setExecuteFrequency("Once a Week");
			eucSchedule3.setExecuteDayOfWeek("Friday");
			listEucFlow.add(eucFlow3);
		}

	}

	@Override
	public ArrayList<EucFlow> getListEucFlow() {
		return listEucFlow;
	}

	@Override
	public EucFlow getEucFlow(String id) {
		for (Iterator<EucFlow> iterator = listEucFlow.iterator(); iterator.hasNext();) {
			EucFlow eucFlow = (EucFlow) iterator.next();
			if (id.equals(eucFlow.getIdString())) {
				return eucFlow;
			}
		}
		return null;
	}

	@Override
	public void addEucFlow(EucFlow eucFlow) {
		listEucFlow.add(eucFlow);

	}

	@Override
	public void deleteEucFlow(String id) {
		for (Iterator<EucFlow> iterator = listEucFlow.iterator(); iterator.hasNext();) {
			EucFlow eucFlow = (EucFlow) iterator.next();
			if (id.equals(eucFlow.getIdString())) {
				iterator.remove();
			}
		}
	}

}
