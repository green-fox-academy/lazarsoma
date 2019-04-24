package main.java.animals;

public class Mammal extends Animal {

  public Mammal(String name) {
    this.name = name;
    breed = "pushing miniature versions out.";
  }

  @Override
  public String breed() {
    return this.breed;
  }
}

