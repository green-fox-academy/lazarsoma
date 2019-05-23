package com.greenfoxacademy.programmerfoxclub;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class FoxList {
  List<Fox> foxes = new ArrayList<>();

  public FoxList() {

  }

  public void addFox(String name) {
    foxes.add(new Fox(name));
  }

  public Fox getFoxes(String name) {
    for (Fox fox : foxes) {
      if (fox.getName().equals(name)) {
        return fox;
      }
    } return null;
  }
}