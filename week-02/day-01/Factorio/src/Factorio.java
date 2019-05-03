public class Factorio {
  public static void main(String[] args) {
    System.out.println(factorio(5));
  }

  public static int factorio(int i) {

    if (i == 0)
      return 1;
    else
      return (i * factorio(i - 1));
  }
}

