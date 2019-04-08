import java.util.Arrays;

public class Matrix {
  public static void main(String[] args) {
    int[][] multi = new int[4][4];
    for (int i = 0; i < multi.length; ++i) {
      for (int j = 0; j < multi.length; ++j) {
        if (i == j) {
          multi[i][j] = 1;
        }
      }
    }
    for (int i = 0; i < multi.length; ++i) {
      for (int j = 0; j < multi.length; ++j) {
        System.out.print(multi[i][j] + " ");
      }
      System.out.println();
    }



  }
}