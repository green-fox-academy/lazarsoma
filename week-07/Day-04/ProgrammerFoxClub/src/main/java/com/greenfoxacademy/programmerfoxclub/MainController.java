package com.greenfoxacademy.programmerfoxclub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  private FoxList foxlist;

  @RequestMapping(path = "/index", method = RequestMethod.GET)
  public String index(@RequestParam(required = false) String name, Model model) {

    if (name == null) {
      return "login";
    } else {
      model.addAttribute("fox", foxlist.getFoxes(name));
      return "index";
    }
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @RequestMapping(path = "/login", method = RequestMethod.POST)
  public String login(String name) {
    foxlist.addFox(name);
    return "redirect:/index?name=" + name;
  }
}

