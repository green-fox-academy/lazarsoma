public class DrawPyramid {
  public static void main(String[] args) {
    int number = 5;

    for (int i = 0; i < number; i++) {

      for (int j = i; j < (2 * number - 1) / 2; j++) {
        System.out.print(" ");
      }

      for (int k = 0; k <= i * 2; k++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}

