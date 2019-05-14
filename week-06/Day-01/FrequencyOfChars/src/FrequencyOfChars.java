import java.util.*;
import java.util.stream.Collectors;

public class FrequencyOfChars {
  public Map<String, Long> countChars(String input) {
    Map<String, Long> frequentChars = Arrays.stream(input.toLowerCase().split(""))
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    frequentChars.forEach((k, v) -> System.out.println(k + ":" + v));
    return frequentChars;
  }
}
