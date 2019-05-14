import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class getSum {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    IntSummaryStatistics averages = numbers.stream()
            .filter(i -> i % 2 != 0)
            .mapToInt((i) -> i).summaryStatistics();
    System.out.println(averages);
    System.out.println("Sum: " + averages.getSum());
  }
}
