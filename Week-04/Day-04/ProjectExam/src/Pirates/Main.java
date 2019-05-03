package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Ship ship = new Ship();
    Pirate pirate1 = new Pirate("Joe", 100, true, true);
    Pirate pirate2 = new Pirate("Jack", 8, true, false);
    ship.addCrew(pirate1);
    ship.addCrew(pirate2);
    Pirate pirate3 = new Pirate("Captain", 100, true, true);

    System.out.println(ship.getGolds());
    System.out.println(ship.getPoorPirates());
    ship.lastDayOnTheShip();
    ship.prepareForBattle();
  }
}
