import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class AvarageValueOfOddNumbers {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    IntSummaryStatistics averages = numbers.stream()
            .filter(i -> i % 2 != 0)
            .mapToInt((i) -> i).summaryStatistics();
    System.out.println(averages);
    System.out.println("Average: " + averages.getAverage());
  }
}
