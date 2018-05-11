package com.treats.euc.ui.controller;

import org.springframework.web.bind.annotation.RestController;

import com.treats.euc.model.DocumentTemplate;
import com.treats.euc.services.DocTemplateServicesInterface;
import com.treats.euc.services.DocTemplateServicesMemory;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/treats-euc-ui/doctemplate")
public class DocTemplateController {
	
	private static DocTemplateServicesInterface docTemplateService;
	
	DocTemplateController(){
		//docTemplateService = new DocTemplateServicesMemory();
	}
    
    @RequestMapping("/getalltemplates")
    public ArrayList<DocumentTemplate> getAllTemplates() {
    	
    	return null;
        //return "testing";
    }
    
}
