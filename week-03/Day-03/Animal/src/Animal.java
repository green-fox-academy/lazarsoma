public class Animal {
  Integer hunger;
  Integer thirst;

  public Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public void eat() {
    int eat = hunger - 1;
    System.out.println(eat);
  }

  public void drink() {
    int drink = thirst - 1;
    System.out.println(drink);
  }

  public void play() {
    int eat = hunger +1;
    int drink = thirst + 1;
    System.out.println(eat);
    System.out.println(drink);
  }
}

