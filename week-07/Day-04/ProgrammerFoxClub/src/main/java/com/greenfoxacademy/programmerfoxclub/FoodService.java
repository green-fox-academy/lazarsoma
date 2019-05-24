package com.greenfoxacademy.programmerfoxclub;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {
  List<String> foods;

  public FoodService(){

    foods = new ArrayList<>();
    foods.add("hamburger");
    foods.add("pizza");
    foods.add("lime");
  }

  public List<String> getFoods() {
    return foods;
  }

  public void setFoods(List<String> foods) {
    this.foods = foods;
  }
}
