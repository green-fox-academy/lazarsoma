
public class PostIt {
  String text;
  String backGroundColor;
  String textColor;

  public PostIt(String text, String backGroundColor, String colorText) {
    this.text = text;
    this.backGroundColor = backGroundColor;
    this.textColor = colorText;
  }
 public void printOrange() {
    System.out.println("orange");
 }
 public void printPink() {
    System.out.println("pink");
  }
 public void printYellow() {
    System.out.println("yellow");
  }
}

