package com.greenfoxacademy.programmerfoxclub;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DrinkService {
  List<String> drinks;

  public DrinkService(){

    drinks = new ArrayList<>();
    drinks.add("cola");
    drinks.add("water");
    drinks.add("beer");
  }

  public List<String> getDrinks() {
    return drinks;
  }

  public void setDrinks(List<String> drinks) {
    this.drinks = drinks;
  }
}