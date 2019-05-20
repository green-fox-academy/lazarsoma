import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Wiki2 {
  public static void main(String[] args) throws Exception {
    Files.lines(Paths.get("assets/dunbarhotel"))
            .flatMap(Pattern.compile("\\W+")::splitAsStream)
            .filter(s -> s.length() >= 4)
            .map(String::toLowerCase)
            .collect(Collectors.groupingBy(w->w, Collectors.summingInt(w->1)))
            .entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .limit(10)
            .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
  }
}