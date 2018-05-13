package com.treats.euc.services;

import java.util.ArrayList;

import com.treats.euc.model.EucFlow;

public interface EucFlowServicesInterface {

	public ArrayList<EucFlow> getListEucFlow();
	
	public EucFlow getEucFlow(String id);
	
	public void addEucFlow(EucFlow eucFlow);
	
	public void deleteEucFlow(String id);
	
	
}
