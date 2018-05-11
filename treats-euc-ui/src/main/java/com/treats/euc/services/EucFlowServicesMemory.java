package com.treats.euc.services;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import com.treats.euc.model.EucFlow;
import com.treats.euc.model.EucSchedule;

public class EucFlowServicesMemory implements EucFlowServicesInterface {

	private ArrayList<EucFlow> listEucFlow;
	
	public EucFlowServicesMemory(){
		EucFlow eucFlow = new EucFlow();
		eucFlow.setDescription("EUC Workflow 001");
		eucFlow.setDocumentTemplateID(UUID.randomUUID());
		eucFlow.setSql("SELETC TAGMAB, TABRNO, TADLNO FROM ANUTTSFP/MPESPTP");
		eucFlow.setOutput("EMAIL");
		EucSchedule eucSchedule = new EucSchedule();
		LocalTime executeTime = LocalTime.of(11, 58, 59);
		eucSchedule.setExectueTime(executeTime);
		eucSchedule.setExecuteFrequency("Once a Week");
		eucSchedule.setExecuteDayOfWeek("Friday");
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
