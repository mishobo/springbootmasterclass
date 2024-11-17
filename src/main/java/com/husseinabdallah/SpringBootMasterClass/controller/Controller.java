package com.husseinabdallah.SpringBootMasterClass.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class Controller {

    @Value("${spring.application.name}")
    private String name;

    @GetMapping(value = "hello")
    public String hello(){
        return name;
    }
}
