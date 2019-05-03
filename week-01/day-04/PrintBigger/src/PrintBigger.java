import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your first number:");
    int firstNumber = scanner.nextInt();
    System.out.println("Enter your second number:");
    int secondNumber = scanner.nextInt();

    if(firstNumber > secondNumber) {
      System.out.println(firstNumber);
    } else if(firstNumber < secondNumber) {
      System.out.println(secondNumber);
    } else {
      System.out.println("The numbers are equal.");
    }
  }
}
