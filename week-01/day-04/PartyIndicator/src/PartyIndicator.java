import java.util.Scanner;

public class PartyIndicator {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of girls:");
        int numberOfGirls = input.nextInt();
        System.out.println("Please enter the number of boys:");
        int numberOfBoys = input.nextInt();

        if (numberOfGirls <= 0) {
            System.out.println("Sausage party");
        }
        else if (numberOfGirls == numberOfBoys && numberOfGirls + numberOfBoys >= 20) {
            System.out.println("The party is excellent!");
        }
        else if (numberOfGirls != numberOfBoys && numberOfGirls + numberOfBoys >= 20) {
            System.out.println("Quite a good party!");
        }
        else if (numberOfGirls + numberOfBoys < 20) {
            System.out.println("Average party...");
        }

        }
    }


