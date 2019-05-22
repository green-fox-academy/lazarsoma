package com.greenfoxacademy.playingwithcolor;

import com.greenfoxacademy.playingwithcolor.Service.MyColor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

  private MyColor myColor;

  public Controller (@Qualifier("RedColor") MyColor myColor) {
    this.myColor = myColor;
  }

  @GetMapping("/color")
  @ResponseBody
  public String Index() {
    return myColor.printColor();
  }
}
