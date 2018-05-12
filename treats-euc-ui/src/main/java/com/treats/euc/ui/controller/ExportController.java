package com.treats.euc.ui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExportController {

    @RequestMapping("/ExportPdf")
    public String getRest() {
//        model.addAttribute("users", userService.findAllUsers());
        return "";
    }
	
}
