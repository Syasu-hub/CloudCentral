package com.example.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {
    @RequestMapping("/defaultfallback")
    public String defaultfallback(){
        return "error";
    }
}
