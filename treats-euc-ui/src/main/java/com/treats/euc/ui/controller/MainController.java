package com.treats.euc.ui.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
	public String login(Map<String, Object> model) {
		return "login";
	}

	@RequestMapping(value = "/treats-euc", method = RequestMethod.GET)
	public String userMainScreen(Map<String, Object> model) {
		return "treats-euc";
	}

	@RequestMapping(value = "/treats-euc/template-edit", method = RequestMethod.GET)
	public String templateEdit(Map<String, Object> model) {
		return "template-edit";
	}
	
	@RequestMapping(value = "/treats-euc/template-edit/{id}", method = RequestMethod.GET)
	public String templateIdEdit(@PathVariable String id, Map<String, Object> model) {
		model.put("templateId", id);
		return "template-edit";
	}
	
	@RequestMapping(value = "/treats-euc-admin", method = RequestMethod.GET)
	public String adminMainScreen(Map<String, Object> model) {
		return "treats-euc-admin";
	}


}