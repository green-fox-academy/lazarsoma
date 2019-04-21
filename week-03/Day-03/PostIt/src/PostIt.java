
public class PostIt {
  String text;
  String backGroundColor;
  String textColor;

  public PostIt(String text, String backGroundColor, String colorText) {
    this.text = text;
    this.backGroundColor = backGroundColor;
    this.textColor = colorText;
  }
 public void printColor() {
    System.out.println(this.backGroundColor);
 }
 public void printText() {
    System.out.println(this.text);
  }
 public void printTextColor() {
    System.out.println(this.textColor);
  }
}

