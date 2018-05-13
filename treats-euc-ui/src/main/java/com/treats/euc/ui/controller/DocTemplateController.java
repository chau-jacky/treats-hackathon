package com.treats.euc.ui.controller;

import com.treats.euc.model.DocumentTemplate;
import com.treats.euc.services.DocTemplateServicesDataStore;
import com.treats.euc.services.DocTemplateServicesInterface;
import com.treats.euc.services.DocTemplateServicesMemory;
import com.treats.euc.ui.TreatsConstants;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/treats-euc/doctemplate")
public class DocTemplateController {
	
	private static DocTemplateServicesInterface docTemplateService;
	
	DocTemplateController() throws FileNotFoundException, IOException{
		docTemplateService = new DocTemplateServicesDataStore();
	}
        
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String someMethod(@RequestParam("template") String templateDetails, @RequestParam("description") String description) {
    	
    	ArrayList<String> fields = new ArrayList<String>();
    	String templateString = templateDetails.replace("<br>","<br/>");
    	
    	DocumentTemplate docTemplate = new DocumentTemplate();
    	docTemplate.setDocTemplate(templateString);
    	docTemplate.setDescription(description);
    	
		Pattern fieldPattern = Pattern.compile(TreatsConstants.PATTERN_FIELD);
		Matcher matcher = fieldPattern.matcher(templateString);
		while (matcher.find()) {
		    fields.add(matcher.group(1));
		}
    	docTemplate.setDataFields(fields);
    	
    	// TODO : remove hardcoding
    	// ===================================
    	docTemplate.setDataSystem("hk_treats");
    	docTemplate.setDataTable("trade_info");
    	// ===================================
    	
    	
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
