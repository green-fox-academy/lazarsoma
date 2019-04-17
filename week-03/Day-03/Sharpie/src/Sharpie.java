public class Sharpie {
   String color;
   Float width;
   Float inkAmount = 100.75f;

  public Sharpie (String color, Float width) {
    this.color = color;
    this.width = width;
  }
  public void inkAmountDecrease() {
    int n = 10;
    Float decreasedAmount = inkAmount - n;
    System.out.println(decreasedAmount);
  }
}
