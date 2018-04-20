package com.free.eurekaclient.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by chenxuewei on 2018/4/13.
 */
@RestController
public class HelloController {

  private final Logger logger = Logger.getLogger(getClass());

  @Autowired
  private DiscoveryClient discoveryClient;


  @GetMapping("/hello")
  public String hello() {
    logger.info( "Services: " + discoveryClient.getServices());
    return "Hello World";
  }

}
