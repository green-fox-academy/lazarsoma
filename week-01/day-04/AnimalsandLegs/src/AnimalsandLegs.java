import java.util.Scanner;

public class AnimalsandLegs {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the number of chickens: ");
    int numberOfChickens = input.nextInt();
    System.out.println("Please enter the number of pigs: ");
    int numberOfPigs = input.nextInt();

    System.out.println ("The number of the legs of the animals: " + (numberOfChickens * 2 + numberOfPigs * 4));

  }
}
