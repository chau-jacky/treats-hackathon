package com.treats.euc.ui.controller;

import org.springframework.web.bind.annotation.RestController;

import com.treats.euc.model.DocumentTemplate;
import com.treats.euc.model.EucFlow;
import com.treats.euc.model.EucFlowDisplay;
import com.treats.euc.services.DocTemplateServicesDataStore;
import com.treats.euc.services.DocTemplateServicesInterface;
import com.treats.euc.services.EucFlowServicesInterface;
import com.treats.euc.services.EucFlowServicesMemory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

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
        
    @RequestMapping("/getalleucflowsdisplay")
    public ArrayList<EucFlowDisplay> getAllEucFlowDisplay() throws FileNotFoundException, IOException {
    	
    	System.out.println("getAllEucFlowDisplay");
    	
    	DocTemplateServicesInterface docService = new DocTemplateServicesDataStore();
    	
    	ArrayList<EucFlow> eucFlow = eucFlowService.getListEucFlow();
    	ArrayList<EucFlowDisplay> eucFlowDisplay = new ArrayList<EucFlowDisplay>();
    	
    	for (Iterator<EucFlow> iterator = eucFlow.iterator(); iterator.hasNext();) {
        	System.out.println("each eucflow");
			EucFlow eucFlow2 = (EucFlow) iterator.next();
			
			DocumentTemplate doc = docService.getDocumentTemplate(eucFlow2.getDocumentTemplateID().toString());
        	System.out.println("doc serivce");

			
			EucFlowDisplay eucDisplay = new EucFlowDisplay();
			eucDisplay.setId(eucFlow2.getId());
			eucDisplay.setName(eucFlow2.getName());
			eucDisplay.setDescription(eucFlow2.getDescription());
			
			eucDisplay.setDataSource(doc.getDataSystem());
			eucDisplay.setDataTable(doc.getDataTable());
			eucDisplay.setTemplateName(doc.getDescription());
			eucDisplay.setOutputFormat(eucFlow2.getOutputFormat());
			eucDisplay.setOutputMedium(eucFlow2.getOutputMedium());
			eucDisplay.setSchedule("Daily Report @ 12:00");
			
			
			eucFlowDisplay.add(eucDisplay);
		}
    	return eucFlowDisplay;
    }

    
}
