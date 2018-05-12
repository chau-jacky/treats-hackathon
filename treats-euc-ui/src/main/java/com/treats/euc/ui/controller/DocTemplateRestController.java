package com.treats.euc.ui.controller;

import org.springframework.web.bind.annotation.RestController;

import com.treats.euc.model.DocumentTemplate;
import com.treats.euc.services.DocTemplateServicesInterface;
import com.treats.euc.services.DocTemplateServicesMemory;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/treats-euc/doctemplate")
public class DocTemplateRestController {
	
	private static DocTemplateServicesInterface docTemplateService;
	
	DocTemplateRestController(){
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
