import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Please type the number:");
        int myNumber = input.nextInt();
        int i = 0;

        for (i = 1; i < 11; i++) {
            System.out.println (i + " * " + myNumber + " = " + i *myNumber);
        }

    }
}
