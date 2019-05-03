public class Bird extends Animal implements Flyable {

  public Bird(String name) {
    this.name = name;
    breed = "laying eggs.";
  }

  @Override
  public String breed() {
    return this.breed;
  }

  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }
}