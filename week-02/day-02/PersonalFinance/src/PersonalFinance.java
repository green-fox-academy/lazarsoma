import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonalFinance {
  public static void main(String[] args) {
    List<Integer> listOfExpenses = new ArrayList<>();
    listOfExpenses.add(500);
    listOfExpenses.add(1000);
    listOfExpenses.add(1250);
    listOfExpenses.add(175);
    listOfExpenses.add(800);
    listOfExpenses.add(120);

    int maxSet = Collections.max(listOfExpenses);
    System.out.println("The greatest expense: " + maxSet);

    int minSet = Collections.min(listOfExpenses);
    System.out.println("The cheapest spending: " + minSet);

    int summa = summa(listOfExpenses);
    System.out.println("Sum: " + summa);

    System.out.println("Sum: " + summa(listOfExpenses));

    int avr = avr(listOfExpenses);
    System.out.println("Average: " + avr);
  }

  public static int summa(List<Integer> listOfExpenses) {
    int sum = 0;
    for (int i : listOfExpenses) {
      sum += i;
    }
    return sum;
  }

  public static int avr(List<Integer> listOfExpenses) {
    int total = 0;
    int avg = 0;
    for (int i = 0; i < listOfExpenses.size(); i++) {
      total = total + listOfExpenses.get(i);
      avg = total / listOfExpenses.size();
    }
    return avg;
  }
}



