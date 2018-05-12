package com.treats.euc.ui.controller;

import org.springframework.web.bind.annotation.RestController;

import com.treats.euc.model.EucFlow;
import com.treats.euc.services.EucFlowServicesInterface;
import com.treats.euc.services.EucFlowServicesMemory;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/treats-euc/eucflow")
public class EucFlowController {
	
	private static EucFlowServicesInterface eucFlowService;
	
	EucFlowController(){
		eucFlowService = new EucFlowServicesMemory();
	}
    
    @RequestMapping("/getalleucflows")
    public ArrayList<EucFlow> getAllEucFlow() {
    	return eucFlowService.getListEucFlow();
    }
    
    @RequestMapping("/geteucflow/{id}")
    public EucFlow getTemplatesById(@PathVariable String id) {
    	return eucFlowService.getEucFlow(id);
    }
    
    
    
}
