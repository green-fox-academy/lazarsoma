package com.greenfoxacademy.playingwithcolor;

import com.greenfoxacademy.playingwithcolor.Service.MyColor;
import com.greenfoxacademy.playingwithcolor.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

  private MyColor myColor;

  @Autowired
  public Controller(@Qualifier("GreenColor") MyColor myColor) {
    this.myColor = myColor;
  }

  @GetMapping("/color")
  @ResponseBody
  public String index() {
    myColor.printColor();
    return "index";
  }
  @Autowired
  @Qualifier("Utilities")
  private UtilityService utility;

  @GetMapping("/useful")
  public String useful() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String Colored(Model model) {
    model.addAttribute("color", utility.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String email(Model model, @RequestParam(required = true) String email) {
    if (utility.validateEmail(email)) {
      model.addAttribute("color", "color: green");
      model.addAttribute("text", email + " is a valid email address");
    } else {
      model.addAttribute("color", "color: red");
      model.addAttribute("text", email + " is an invalid email address");
    }
    return "email";
  }

  @GetMapping("/useful/encode")
  public String Encode(Model model, @RequestParam(required = true) String text, @RequestParam(required = true) int num) {
    model.addAttribute("toWrite", utility.caesar(text, num));
    return "useful";
  }

  @GetMapping("/useful/decode")
  public String Decode(Model model, @RequestParam(required = true) String text, @RequestParam(required = true) int num) {
    model.addAttribute("toWrite", utility.caesar(text, 0-num));
    return "useful";
  }
}

