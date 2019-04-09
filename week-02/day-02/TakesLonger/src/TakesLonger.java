public class TakesLonger {
  public static void main(String... args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    StringBuffer sb = new StringBuffer("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
    sb.insert(21, "always take longer than ");
    System.out.println(sb);
  }
}
    





