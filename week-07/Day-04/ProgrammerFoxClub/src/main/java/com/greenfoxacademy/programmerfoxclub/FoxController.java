package com.greenfoxacademy.programmerfoxclub;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


public class FoxController {


  @RequestMapping(path = "/nutritionStore", method = RequestMethod.GET)
  public String index(@RequestParam(required = false) String name, Model model) {

    if (name == null) {
      return "login";
    } else {
      model.addAttribute("fox", new Fox(name));
      return "index";
    }
  }

  @RequestMapping(path = "/nutritionStore", method = RequestMethod.POST)
  public String login(String name) {
    return "redirect:/index?name=" + name;
  }
}
