package Pirates;

  public class Pirate {

    String name;
    int gold;
    int health = 10;
    boolean wooden;
    boolean captain;

    public Pirate(String name, int gold, boolean wooden, boolean captain) {
      this.name = name;
      this.gold = gold;
      this.wooden = wooden;
      this.captain = captain;
    }

    public void work() {

      if (captain) {
        this.gold += 10;
        this.health -= 5;
      } else {
        this.gold++;
        this.health--;
      }
    }

    public void party() {
      if (captain) {
        this.health += 10;
      } else {
        this.health++;
      }
    }

    public String toString() {
      if (wooden) {
        return "Hello, I'm " + name + ". I have a wooden leg and " + gold + " golds.";
      } else {
        return "Hello, I'm " + name + ". I still have my real legs and " + gold + " golds.";
      }
    }
  }
