import java.util.Scanner;
import java.util.stream.IntStream;

public class AverageOfInput {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter five numbers in a row: ");
    int numberone = input.nextInt();
    int numbertwo = input.nextInt();
    int numberthree = input.nextInt();
    int numberfour = input.nextInt();
    int numberfive = input.nextInt();
    System.out.println("Sum: " + (IntStream.of(numberfive, numberfour, numberone, numberthree, numbertwo).sum()));
    System.out.println("Average: " + ((numberone + numbertwo + numberthree + numberfour + numberfive) / 5));
    }

  }

