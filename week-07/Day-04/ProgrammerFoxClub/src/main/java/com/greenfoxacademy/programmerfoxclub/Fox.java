package com.greenfoxacademy.programmerfoxclub;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  String name;
  List<Tricks> listTricks = new ArrayList<>();
  String food;
  String drink;

  public Fox() {

  }

  public Fox(String name){
    this.name = name;
    this.drink = "cola";
    this.food = "hamburger";
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

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
