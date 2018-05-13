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
		listEucFlow = new ArrayList<EucFlow>();
		
		EucFlow eucFlow = new EucFlow();
		eucFlow.setDescription("EUC Workflow 001");
		eucFlow.setDocumentTemplateID(UUID.randomUUID());
		// eucFlow.setSql("SELETC TAGMAB, TABRNO, TADLNO FROM ANUTTSFP/MPESPTP");
		eucFlow.setSql("SELECT TradeID, TradeType, Country, GroupMember, BranchNumber FROM hk_treats.trade_info");
		eucFlow.setOutput("EMAIL");
		EucSchedule eucSchedule = new EucSchedule();
		LocalTime executeTime = LocalTime.of(11, 58, 59);
		eucSchedule.setExectueTime(executeTime);
		eucSchedule.setExecuteFrequency("Once a Week");
		eucSchedule.setExecuteDayOfWeek("Friday");		
		listEucFlow.add(eucFlow);
		
		EucFlow eucFlow2 = new EucFlow();
		eucFlow2.setDescription("EUC Workflow 002");
		eucFlow2.setDocumentTemplateID(UUID.randomUUID());
		eucFlow2.setSql("SELECT TradeID, TradeType, Country, GroupMember, BranchNumber, TradeDate, ValueDate, BuyCcy, SellCcy, BuyAmount, SellAmount FROM hk_treats.trade_info");
		eucFlow2.setOutput("EMAIL");
		EucSchedule eucSchedule2 = new EucSchedule();
		LocalTime executeTime2 = LocalTime.of(11, 58, 59);
		eucSchedule2.setExectueTime(executeTime2);
		eucSchedule2.setExecuteFrequency("Once a Week");
		eucSchedule2.setExecuteDayOfWeek("Friday");
		listEucFlow.add(eucFlow2);
		
		EucFlow eucFlow3 = new EucFlow();
		eucFlow3.setDescription("EUC Workflow 003");
		eucFlow3.setDocumentTemplateID(UUID.randomUUID());
		eucFlow3.setSql("SELETC TAGMAB, TABRNO, TADLNO FROM ANUTTSFP/MPESPTP");
		eucFlow3.setOutput("EMAIL");
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
