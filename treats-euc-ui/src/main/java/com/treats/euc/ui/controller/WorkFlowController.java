package com.treats.euc.ui.controller;

import com.treats.euc.model.EucFlow;
import com.treats.euc.services.EucFlowServicesInterface;
import com.treats.euc.services.EucFlowServicesMemory;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/treats-euc/workflow")
public class WorkFlowController {

	@RequestMapping(value = "/create")
	public String getDataSets(@RequestParam("name") String name,
							  @RequestParam("description") String description,
			                  @RequestParam("templateId") String templateId,
			                  @RequestParam("filter") String filter,
			                  @RequestParam("format") String format,
			                  @RequestParam("medium") String medium,
			                  @RequestParam("email") String email) {

		EucFlowServicesInterface flowService = new EucFlowServicesMemory();
		
		EucFlow eucFlow = new EucFlow();
		eucFlow.setName(name);
		eucFlow.setDescription(description);
		eucFlow.setDocumentTemplateID(UUID.fromString(templateId));
		eucFlow.setFiler(filter);
		eucFlow.setOutputFormat(format);
		eucFlow.setOutputMedium(medium);
		eucFlow.setEmailAddress(email);
		
		flowService.addEucFlow(eucFlow);
		
		return "treats-euc";
	}

}
