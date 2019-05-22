package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.Service.Printer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller

public class Controller {

  private Printer printer;

  public Controller(Printer printer) {
    this.printer = printer;
  }

  @GetMapping("/message")
  @ResponseBody
  public String Index() {
    return printer.log("Hello Soma!");
  }
}
