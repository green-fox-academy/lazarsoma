package com.greenfoxacademy.springstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  @RequestMapping("/whatever")
  public String getName(@RequestParam(required = true) String name) {
    return "such " + name;
  }
  AtomicLong val = new AtomicLong();

  @RequestMapping(value="/greeting")
  public Greeting greeting () {

    long res = val.getAndIncrement();
    Greeting greeting = new Greeting(res, "Hello, Soma");
    return greeting;
  }
}
