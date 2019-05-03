import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class TelephoneBook {
  public static void main(String[] args) {
    HashMap<String, String> phoneBook = new HashMap<>();
    phoneBook.put("William A. Lathan", "405-709-1865");
    phoneBook.put("John K. Miller", "402-247-8568");
    phoneBook.put("Hortensia E. Foster", "606-481-6467");
    phoneBook.put("Amanda D. Newland", "319-243-5613");
    phoneBook.put("Brooke P. Askew", "307-687-2982");
    phoneBook.put("Charlie", "307-687-2982");

    for (String key : phoneBook.keySet()) {
      System.out.println(key + ": " + phoneBook.get(key));
    }

    System.out.println("");

    System.out.println("John K. Miller's phone number is: " + phoneBook.get("John K. Miller"));

    for (String key : phoneBook.keySet()) {
      if (phoneBook.get(key) == "307-687-2982") {
        System.out.println("307-687-2982 is the phone number of: " + key);
      }
    }

    if (phoneBook.containsKey("Chris E. Myers")) {
      System.out.println(phoneBook.get("Chris E. Myers"));
    } else {
      System.out.println("We do not know Chris E. Myers' phone number.");
    }
  }
}