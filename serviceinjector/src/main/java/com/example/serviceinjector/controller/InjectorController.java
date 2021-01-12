package com.example.serviceinjector.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class InjectorController {
    @Autowired
    private EurekaClient discoveryClient;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/inject")
    public String inject(){
        InstanceInfo instanceInfo = discoveryClient.getNextServerFromEureka("service1",false);
        String url = "http://service1/demo";
        ResponseEntity<String> entity = restTemplate.getForEntity(url,String.class);
        return entity.getBody();
    }
}
