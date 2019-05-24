package com.greenfoxacademy.programmerfoxclub;

import org.springframework.stereotype.Service;

@Service
public class Drink {
  String name;

  public Drink() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
