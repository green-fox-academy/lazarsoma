import java.util.Scanner;

public class DrawTriangle {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("Please enter your number:");
        int myNumber = input.nextInt();

        for (int i = 1; i < myNumber + 1; i++) {
            for (int j = i; j < i + 1; j++);
            System.out.print ("*");
        }
            System.out.println("");
        }
    }


