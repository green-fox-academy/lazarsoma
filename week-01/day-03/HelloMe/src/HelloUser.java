
import java.util.Scanner;

public class HelloUser {
        public static void main(String [] args) {
            Scanner input = new Scanner(System.in);
        System.out.println ("Please type your name:");
        String yourName = input.next();
        System.out.println ("Hello, " + yourName);
    }
}
