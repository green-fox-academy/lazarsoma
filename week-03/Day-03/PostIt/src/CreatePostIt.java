public class CreatePostIt {
  public static void main(String [] args) {
    PostIt orange = new PostIt("Idea 1", "orange", "blue");
    orange.printColor();
    orange.printText();
    orange.printTextColor();

    PostIt pink = new PostIt("Awesome", "pink", "black");
    pink.printColor();
    pink.printText();
    pink.printTextColor();

    PostIt yellow = new PostIt("Superb!", "yellow", "green");
    yellow.printColor();
    yellow.printText();
    yellow.printTextColor();

  }
}
