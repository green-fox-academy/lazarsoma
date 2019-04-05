import java.util.Scanner;

public class OddEven {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int yourNumber = input.nextInt();

        if (yourNumber % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
