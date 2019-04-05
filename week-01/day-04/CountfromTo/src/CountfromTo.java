import java.util.Scanner;

public class CountfromTo {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println ("Please enter the first number:");
        int myNumber1 = input.nextInt();
        System.out.println("Please enter the second number:");
        int myNumber2 = input.nextInt();
        int i = myNumber1;
        if (myNumber2 <= myNumber1) {
            System.out.println(" The second number should be bigger.");
        } else{
            for (i = myNumber1; i < myNumber2; i++) {
                System.out.println (i);
            }

        }


    }
}
