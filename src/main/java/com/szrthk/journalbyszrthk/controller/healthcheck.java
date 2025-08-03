package com.szrthk.journalbyszrthk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthcheck { // the problem i faced here is that i put controller outside application
    @GetMapping("/hc")
    public String health (){
        return ("system is working fine.");
    }
}
