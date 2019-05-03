package MatrixRotate;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    MatrixRotate rotate = new MatrixRotate();
    int[][] mat = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
    rotate.rotateMatrix(mat);
    System.out.println(Arrays.toString(mat));
  }
}
