package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar(){
    this.numberOfStrings = 4;
    this.name = "BassGuitar";
  }

  public BassGuitar (int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
    this.name = "BassGuitar";
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }
}
