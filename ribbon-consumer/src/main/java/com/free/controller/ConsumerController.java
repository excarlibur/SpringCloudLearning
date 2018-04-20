package com.free.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chenxuewei on 2018/4/17.
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumer() {
        return restTemplate.getForObject("http://eureka-client/hello", String.class);
    }



}
