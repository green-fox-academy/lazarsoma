public class Main {
  public static void main(String[] args) {

    Shifter s = new Shifter("example", 3);
    for (int i = 0; i < s.length(); i++) {
      System.out.print(s.charAt(i));
    }
    System.out.println("");

    System.out.println(s.charAt(0));

  }
}