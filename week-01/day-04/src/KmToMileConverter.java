import java.util.Scanner;

public class KmToMileConverter {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("Please type the distance in kilometers:");
        double distKm = input.nextDouble();
        //System.out.println (distKm + " km");
        double distMl = (distKm * 0.621);
        System.out.println (distKm + " kilometers is " + distMl + " miles");

    }
}
