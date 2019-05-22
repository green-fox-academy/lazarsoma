package com.greenfoxacademy.playingwithcolor.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("RedColor")
public class RedColor implements MyColor {
  @Override
  public String printColor() {
    String message = "It is red in color...";
    System.out.println(message);
    return message;
  }
}
