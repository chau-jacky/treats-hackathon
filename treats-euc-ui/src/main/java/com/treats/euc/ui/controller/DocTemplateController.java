package com.treats.euc.ui.controller;

import com.treats.euc.model.DocumentTemplate;
import com.treats.euc.services.DocTemplateServicesInterface;
import com.treats.euc.services.DocTemplateServicesMemory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/treats-euc/doctemplate")
public class DocTemplateController {
	
	private static DocTemplateServicesInterface docTemplateService;
	
	DocTemplateController(){
		docTemplateService = new DocTemplateServicesMemory();
	}
        
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String someMethod(@RequestParam("template") String templateDetails, @RequestParam("description") String description) {
    	DocumentTemplate docTemplate = new DocumentTemplate();
    	docTemplate.setDescription("New Doc Template");
    	docTemplate.setDocTemplate(templateDetails.replace("<br>","<br/>"));
    	docTemplate.setDescription(description);
    	
    	docTemplateService.addDocTemplate(docTemplate);
    	
		return "treats-euc";
    }
    
    /* draft only, pending update function
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String update(@RequestParam("template") String templateDetails, @PathVariable String id) {
    	docTemplateService.updateDocTemplate(id, templateDetails);
    	return "treats-euc";
    }
    */
}
