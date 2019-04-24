package main.java.animals;

public class Bird extends Animal {

  public Bird(String name) {
    this.name = name;
    breed = "laying eggs.";
  }

  @Override
  public String breed() {
    return this.breed;
  }
}
