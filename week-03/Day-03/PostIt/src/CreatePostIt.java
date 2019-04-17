public class CreatePostIt {
  public static void main(String [] args) {
    PostIt orange;
    orange = new PostIt("Idea 1", "orange", "blue");
    orange.printOrange();

    PostIt pink;
    pink = new PostIt("Awesome", "pink", "black");
    pink.printPink();

    PostIt yellow;
    yellow = new PostIt("Superb!", "yellow", "green");
    yellow.printYellow();

  }
}
