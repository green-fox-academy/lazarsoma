package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar (){
    this.numberOfStrings = 6;
    this.name = "ElectricGuitar";
  }

  public ElectricGuitar (int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
    this.name = "ElectricGuitar";
  }

  @Override
  public String sound() {
    return "Twang";
  }
}
