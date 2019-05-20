package com.greenfoxacademy.bankofsimba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {

  @GetMapping("/show")
  public String account(Model model) {
    model.addAttribute(new BankAccount("Simba",2000, "lion", "Zebra"));
    return "index";
  }

  @GetMapping("/text")
  public String text(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "text";
  }
}
