public class NumberAdder {
  public static void main (String [] args) {
    AddByOne(1);
    System.out.println(AddByOne(10));
  }

  public static int AddByOne(int n) {
    if (n >= 1) {
      return n + AddByOne(n - 1);
    }
    return n;
  }
}




