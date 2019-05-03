public class Sharpie {
  String color;
  float width;
  int inkAmount = 100;

  public Sharpie (String color, Float width) {
    this.color = color;
    this.width = width;
  }
  public void use() {
    this.inkAmount -= 100;
  }
}