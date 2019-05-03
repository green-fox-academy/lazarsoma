public class Animal {
  int hunger = 50;
  int thirst = 50;

  public Animal() {
  }

  public void eat() {
    --this.hunger;
    System.out.println(this.hunger);
  }

  public void drink() {
    --this.thirst;
    System.out.println(this.thirst);
  }

  public void play() {
    --this.hunger;
    --this.thirst;
    System.out.println("hunger: " + this.hunger);
    System.out.println("thirst " + this.thirst);
  }
}