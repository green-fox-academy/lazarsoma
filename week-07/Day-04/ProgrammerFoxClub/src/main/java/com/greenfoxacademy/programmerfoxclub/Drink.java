package com.greenfoxacademy.programmerfoxclub;

import org.springframework.stereotype.Service;

@Service
public class Drink {
  String name;

  public Drink() {

  }

  public Drink(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
