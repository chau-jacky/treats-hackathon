package com.treats.euc.ui.controller;

import org.springframework.web.bind.annotation.RestController;

import com.treats.euc.model.DocumentTemplate;
import com.treats.euc.services.DocTemplateServicesInterface;
import com.treats.euc.services.DocTemplateServicesMemory;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/treats-euc/doctemplate")
public class DocTemplateController {
	
	private static DocTemplateServicesInterface docTemplateService;
	
	DocTemplateController(){
		docTemplateService = new DocTemplateServicesMemory();
	}
    
    @RequestMapping("/getalldoctemplates")
    public ArrayList<DocumentTemplate> getAllTemplates() {
    	return docTemplateService.getListDocumentTemplate();
    }
    
    @RequestMapping("/getdoctemplate/{id}")
    public DocumentTemplate getTemplatesById(@PathVariable String id) {
    	return docTemplateService.getDocumentTemplate(id);
    }
    
    
    
}
