package com.greenfoxacademy.programmerfoxclub;

import org.springframework.stereotype.Service;

@Service
public class Food {
  String name;

  public Food () {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
