package com.free.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenxuewei on 2018/4/13.
 */
@RestController
public class HelloController {


  @GetMapping("/hello")
  public String hello() {
    String services = "Services: " ;
    System.out.println(services);
    return services;
  }

}
