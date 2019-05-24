package com.greenfoxacademy.programmerfoxclub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

  @Autowired
  private FoxList foxlist;


  @RequestMapping(path = "/nutritionStore", method = RequestMethod.GET)
  public String index(@RequestParam(required = false) String name, Model model) {

    if (name == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("fox", foxlist.getFoxes(name));
      model.addAttribute("food",foxlist.getFoxes(name).getFood());
      model.addAttribute("drink",foxlist.getFoxes(name).getDrink());
      return "nutritionStore";
    }
 }

  @RequestMapping(path = "/nutritionStore", method = RequestMethod.POST)
  public String login(String name, String food, String drink) {
    foxlist.addFox(name);
    foxlist.getFoxes(name).setFood(food);
    foxlist.getFoxes(name).setDrink(drink);
    return "redirect:/index?name=" + name;
  }
}
