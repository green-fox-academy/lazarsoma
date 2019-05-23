package com.greenfoxacademy.programmerfoxclub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

  @RequestMapping(path = "/index", method = RequestMethod.GET)
  public String index(@RequestParam(required = false) String name, Model model) {

    if (name == null) {
      return "login";
    } else {
      model.addAttribute("fox", new Fox(name));
      return "index";
    }
  }

  @RequestMapping(path = "/login", method = RequestMethod.POST)
  public String login(String name) {
    return "redirect:/index?name=" + name;
  }
}
