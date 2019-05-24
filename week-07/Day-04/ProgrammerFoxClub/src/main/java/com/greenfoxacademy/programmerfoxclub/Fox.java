package com.greenfoxacademy.programmerfoxclub;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  @Autowired
  private Drink drink;
  private Food food;

  String name;
  List<Tricks> listTricks;

  public Fox() {

  }

  public Fox(String name) {
    this.name = name;
    drink = new Drink("beer");
    food = new Food("hamburger");
    listTricks = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Tricks> getListTricks() {
    return listTricks;
  }

  public void setListTricks(List<Tricks> listTricks) {
    this.listTricks = listTricks;
  }

  public Drink getDrink() {
    return drink;
  }

  public void setDrink(Drink drink) {
    this.drink = drink;
  }

  public Food getFood() {
    return food;
  }

  public void setFood(Food food) {
    this.food = food;
  }
}
