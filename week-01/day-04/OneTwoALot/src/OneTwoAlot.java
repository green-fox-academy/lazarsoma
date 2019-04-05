import java.util.Scanner;

public class OneTwoAlot {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int yourNumber = input.nextInt();

        if (yourNumber <= 0) {
            System.out.println("Not enough");
        }
        else if (yourNumber == 1) {
            System.out.println("One");
        }
        else if (yourNumber == 2) {
            System.out.println("Two");
        } else{
            System.out.println("A lot");
    }
        }
}