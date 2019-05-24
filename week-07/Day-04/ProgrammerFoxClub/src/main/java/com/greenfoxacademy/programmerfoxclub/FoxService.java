package com.greenfoxacademy.programmerfoxclub;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class FoxService {
  List<Fox> foxes;

  public FoxService() {
    foxes = new ArrayList<>();
  }

  public void addFox(String name) {
    foxes.add(new Fox(name));
  }

  public Fox findFoxByName(String name) {
    for (Fox fox : foxes) {
      if (fox.getName().equals(name)) {
        return fox;
      }
    }
    return null;
  }
}