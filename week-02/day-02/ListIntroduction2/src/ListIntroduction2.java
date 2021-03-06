import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListIntroduction2 {
  public static void main(String[] args) {


    List<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));

    List<String> listB = new ArrayList<>();

    listB.addAll(listA);

    if (listA.contains("Durian")) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

    listB.remove("Durian");

    if (listB.contains("Durian")) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

    listA.add(4, "Kiwifruit");

    System.out.println(listA);
    System.out.println(listB);

    if (listA.equals(listB)) {
      System.out.println("lists are equal in size");
    } else if (listA.size() > listB.size()) {
      System.out.println("A is bigger");
    } else {
      System.out.println("B is bigger");
    }

    System.out.println("");

    System.out.println(listA.indexOf("Avocado"));
    System.out.println(listB.indexOf("Durian"));

    listB.addAll(Arrays.asList("Passion Fruit", "Pummelo"));
    System.out.println(listB);

    System.out.println(listA.get(2));
  }
}