public class Fibonacci {
  public static void main(String[] args) {

    int j = 0;
    while (j < 10) {
      System.out.println(fibonacci(j));
      j++;
    }
  }
  public static int fibonacci(int i) {
    if(i == 0) return 0;
    if(i <= 2) return 1;
    int fibTerm = fibonacci(i - 1) + fibonacci(i -2);
    return fibTerm;
  }
}



