package com.treats.euc.services;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import com.treats.euc.model.EucFlow;
import com.treats.euc.model.EucSchedule;

public class EucFlowServicesMemory implements EucFlowServicesInterface {

	private static ArrayList<EucFlow> listEucFlow;
	
	public EucFlowServicesMemory(){
		listEucFlow = new ArrayList<EucFlow>();
		
		EucFlow eucFlow = new EucFlow();
		eucFlow.setDescription("EUC Workflow 001");
		eucFlow.setDocumentTemplateID(UUID.randomUUID());
		eucFlow.setFiler("WHERE TradeID = '11111'");
		eucFlow.setOutputFormat("EXCEL");
		eucFlow.setOutputMedium("EMAIL");
		EucSchedule eucSchedule = new EucSchedule();
		LocalTime executeTime = LocalTime.of(11, 58, 59);
		eucSchedule.setExectueTime(executeTime);
		eucSchedule.setExecuteFrequency("Once a Week");
		eucSchedule.setExecuteDayOfWeek("Friday");		
		listEucFlow.add(eucFlow);
		
		EucFlow eucFlow2 = new EucFlow();
		eucFlow2.setDescription("EUC Workflow 002");
		eucFlow2.setDocumentTemplateID(UUID.randomUUID());
		eucFlow2.setFiler("WHERE TradeID = '11111'");
		eucFlow2.setOutputFormat("PDF");
		eucFlow2.setOutputMedium("EMAIL");
		EucSchedule eucSchedule2 = new EucSchedule();
		LocalTime executeTime2 = LocalTime.of(11, 58, 59);
		eucSchedule2.setExectueTime(executeTime2);
		eucSchedule2.setExecuteFrequency("Once a Week");
		eucSchedule2.setExecuteDayOfWeek("Friday");
		listEucFlow.add(eucFlow2);
		
		EucFlow eucFlow3 = new EucFlow();
		eucFlow3.setDescription("EUC Workflow 003");
		eucFlow3.setDocumentTemplateID(UUID.randomUUID());
		eucFlow3.setFiler("WHERE TradeID = '11111'");
		eucFlow3.setOutputFormat("EXCEL");
		eucFlow3.setOutputMedium("SERVER");
		EucSchedule eucSchedule3 = new EucSchedule();
		LocalTime executeTime3 = LocalTime.of(11, 58, 59);
		eucSchedule3.setExectueTime(executeTime3);
		eucSchedule3.setExecuteFrequency("Once a Week");
		eucSchedule3.setExecuteDayOfWeek("Friday");
		listEucFlow.add(eucFlow3);

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
			if (id.equals(eucFlow.getIdString())){
				iterator.remove();
			}
		}
	}
	
}
