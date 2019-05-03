public class DrawDiamond {
  public static void main(String[] args) {
    int number = 5;

    for (int i = 1; i <= number; i++) {
      for (int k = 1; k <= number - i; k++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = number - 1; i >= 0; i--) {
      for (int k = 1; k <= number - i; k++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
