package com.example.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@Scope(value = WebApplicationContext.SCOPE_SESSION)
//@EnableEurekaClient
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

}
