import java.util.Arrays;

public class Colors {
  public static void main(String[] args) {

    String[][] colors = {
            {"forest green", "olive", "pale green", "spring green"},
            {"orange red", "red", "tomato"}, {"orchid", "violet", "pink", "hot pink"}};

    for (String[] rows : colors) {
      for (String column : rows) {
        System.out.print(column + ", ");
      }
      System.out.print('\n');
    }
    for (int i = 0; i < colors.length; i++) {
      for (int j = 0; j < colors[i].length; j++) {
        System.out.print(colors[i][j] + ", ");
      }
      System.out.println();
    }
    for (String[] arr : colors) {
      System.out.println(Arrays.toString(arr));
    }
  }
}