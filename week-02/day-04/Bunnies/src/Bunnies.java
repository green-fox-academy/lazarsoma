public class Bunnies {
  public static void main(String[] args) {
    int bunnies = 1;
    int ears = 2;
  }
  public static int numberofears (int bunnies, int ears) {
    if (bunnies >= 1) {
      return numberofears (bunnies * ears, bunnies);
    }
    return bunnies;
  }
}
