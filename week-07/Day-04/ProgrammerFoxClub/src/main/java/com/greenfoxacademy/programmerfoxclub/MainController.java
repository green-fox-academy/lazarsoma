package com.greenfoxacademy.programmerfoxclub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  private FoxService foxservice;

  @Autowired
  private DrinkService drinkService;

  @Autowired
  private FoodService foodService;

  @GetMapping("/index")
  public String index(@RequestParam(name = "name" ,required = false) String name, Model model) {

    if (name == null) {
      return "login";
    } else {
      model.addAttribute("fox", foxservice.findFoxByName(name));
      return "index";
    }
  }

  @RequestMapping(path = "/login", method = RequestMethod.POST)
  public String login(String name) {
    foxservice.addFox(name);
    return "redirect:/index?name=" + name;
  }

  @RequestMapping(path = "/nutritionStore", method = RequestMethod.GET)
  public String indx(@RequestParam(required = false) String name, Model model) {

    if (name == null) {
      return "login";
    } else {
      model.addAttribute("fox", foxservice.findFoxByName(name));
      // Foxnak legyen Drink es Food fieldje es csak a foxot adjuk hozza

      model.addAttribute("food",foodService.getFoods());
      model.addAttribute("drink",drinkService.getDrinks());
      return "nutritionStore";
    }
  }

  @RequestMapping(path = "/nutritionStore/{name}", method = RequestMethod.POST)
  public String login(@PathVariable String name, String food, String drink) {
    foxservice.findFoxByName(name).setFood(new Food(food));
    foxservice.findFoxByName(name).setDrink(new Drink(drink));
    return "redirect:/index?name=" + name;
  }
}

