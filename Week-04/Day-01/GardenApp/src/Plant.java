public class Plant {
  String type;
  String color;
  int currentWaterAmount;



  public Plant(String type, String color, int currentWaterAmount) {
    this.type = type;
    this.color = color;
    this.currentWaterAmount = currentWaterAmount;


  }

  public void watering(int waterAmount) {
    if (currentWaterAmount < 5) {
      currentWaterAmount += (waterAmount * 0.75);
    }
  }

  public void print(){
    System.out.println("Type: " + type + " color: " + color + " Current water amount: " + currentWaterAmount);
  }
}

