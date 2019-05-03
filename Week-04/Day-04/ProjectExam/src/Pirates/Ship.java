package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> crew = new ArrayList<>();

  public void addCrew(Pirate pirate) {
    if (isCaptain() && pirate.captain) {
      System.out.println("Your crew already has a captain.");
    } else {
      crew.add(pirate);
    }
  }

  public boolean isCaptain() {
    for (Pirate p : crew) {
      p.captain = true;
    }
    return false;
  }

  public List<String> getPoorPirates() {
    List<String> poorPiratesList = new ArrayList<>();

    for (Pirate pirate : crew) {
      if (pirate.wooden && pirate.gold < 15) {
        poorPiratesList.add(pirate.name);
      }
    }
    return poorPiratesList;
  }

  public int getGolds() {
    int sum = 0;
    for (Pirate pirate : crew) {
      sum = sum + pirate.gold;
    }
    return sum;
  }

  public void lastDayOnTheShip() {
    for (Pirate pirate : crew) {
      pirate.party();
    }
  }

  public void prepareForBattle() {
    for (Pirate pirate : crew) {
      for (int i = 0; i < 5; i++) {
        pirate.work();
      }
    }
    lastDayOnTheShip();
  }
}

