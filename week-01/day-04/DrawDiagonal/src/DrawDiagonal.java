import java.util.Scanner;

public class DrawDiagonal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter how many lines the square has:");
    int myNumber = input.nextInt();

    for (int i = 1; i <= myNumber; i++) {
      //for (int j = 1; j <= i; j++) {
        System.out.print("%");
      }
      System.out.println("");
    }
  }
//}

