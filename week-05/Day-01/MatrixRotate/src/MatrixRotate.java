public class MatrixRotate {
  public static void main(String[] args) {
    int[][] mat = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
    rotateMatrix(mat);
  }

  static void rotateMatrix(int[][] mat) {

    System.out.println("Before: ");
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();

    int size = mat.length;
    for (int x = 0; x < size / 2; x++) {
      for (int y = x; y < size - x - 1; y++) {
        int nx = size - 1 - x;
        int ny = size - 1 - y;

        int swapVal = mat[x][y];
        mat[x][y] = mat[ny][x];
        mat[ny][x] = mat[nx][ny];
        mat[nx][ny] = mat[y][nx];
        mat[y][nx] = swapVal;
      }
    }
    System.out.println("After: ");
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }
}
