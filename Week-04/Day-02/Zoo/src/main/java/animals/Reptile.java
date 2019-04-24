package main.java.animals;

public class Reptile extends Animal {

  public Reptile(String name) {
    this.name = name;
    breed = "laying eggs.";
  }

  @Override
  public String breed() {
    return this.breed;
  }
}
