package com.greenfoxacademy.programmerfoxclub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
  @RequestMapping(path = "/", method = RequestMethod.GET)
  public String index() {
    return "index";
  }
  @RequestMapping(path = "/login", method = RequestMethod.GET)
  public String login() {
    return "login";
  }

  @RequestMapping(path = "/login", method = RequestMethod.POST)
  public String login(Model model, @RequestParam(required = true) String name) {
    model.addAttribute("name", name);
    return "index";
  }
}
