package com.cuijie.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;

@RestController
@RequestMapping("/show")
public class ShowController {

    @Value("${env_name}")
    private String envName;
    @RequestMapping("/env")
    public String showEnv(){

        return envName;

    }

}
