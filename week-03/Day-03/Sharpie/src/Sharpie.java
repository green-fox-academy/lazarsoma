public class Sharpie {
   String color;
   float width;
   float inkAmount = 100f;

  public Sharpie (String color, Float width) {
    this.color = color;
    this.width = width;
  }
  public void use() {
    this.inkAmount--;
    System.out.println(inkAmount);
    System.out.println(this.color);
    System.out.println(this.width);
  }
}
