public class Fibonacci {
  public static void main(String[] args) {

    int i = 0;
    while (i < 5) {
      System.out.println(fibonacci(i));
      i++;
    }
  }
  public static int fibonacci(int i) {
    if(i == 0) return 0;
    if(i <= 2) return 1;
    int fibTerm = fibonacci(i - 1) + fibonacci(i -2);
    return fibTerm;
  }
}



