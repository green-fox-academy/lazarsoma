public class Tree extends Plant {

  public Tree(String color, int currentWaterAmount) {
    super("tree", color, currentWaterAmount);
  }

  @Override
  public void print() {
    super.print();
  }

  @Override
  public void watering(int waterAmount) {
    if (currentWaterAmount < 10) {
      currentWaterAmount += (waterAmount * 0.4);
    }
  }
}


