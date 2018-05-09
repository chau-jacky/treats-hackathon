package com.treats.euc.ui.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RestfulController {
    
    @RequestMapping("/rest")
    public String getRest() {
    	
        return "testing";
    }
    
}
