public class IncrementElement {
  public static void main(String[]args) {
    int [] t = {1, 2, 3, 4, 5};
    for (int i = 0; i < t.length; i++) {
      if (t[i] == 3) {
       t[i] += 2;
      }
    }
    System.out.println("The third element:" +t[2]);
  }
}
