public class GreatestCommonDivisor {
  public static void main(String[] args) {
    int n1 = 10;
    int n2 = 5;

    int gcd = gcd(n1, n2);
    System.out.println(gcd);

  }
  public static int gcd (int n1, int n2) {
    if (n2 != 0) {
      return gcd(n2, n1 % n2);
    } else
      return n1;
  }
}

