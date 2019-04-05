import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your guess:");
    int yourNumber = input.nextInt();
    int storedNum = 5;

    if (yourNumber > storedNum) {
      System.out.println("The stored number is lower.");
    } else if (yourNumber < storedNum) {
      System.out.println("The stored number is higher.");
    } else {
      System.out.println("You found the number: 5");
    }
  }
}
