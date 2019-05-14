import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStrings {
  public static void main(String[] args) {
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
    List<String> findCities = cities.stream()
            .filter(c -> c.startsWith("A"))
            .collect(Collectors.toList());
    System.out.println(findCities);
  }
}
