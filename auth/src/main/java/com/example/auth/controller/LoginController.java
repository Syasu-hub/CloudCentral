package com.example.auth.controller;

import com.example.auth.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/userlogin")
    public String login() {
        return "login";
    }



}
