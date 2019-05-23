package com.greenfoxacademy.programmerfoxclub;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  String name;
  List<Tricks> listTricks = new ArrayList<>();
  Foods foods;
  Drinks drinks;

  public Fox() {

  }

  public Fox(String name){
    this.name = name;
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

  public Foods getFoods() {
    return foods;
  }

  public void setFoods(Foods foods) {
    this.foods = foods;
  }

  public Drinks getDrinks() {
    return drinks;
  }

  public void setDrinks(Drinks drinks) {
    this.drinks = drinks;
  }
}
