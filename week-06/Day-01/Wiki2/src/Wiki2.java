import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Wiki2 {
  public static void main(String[] args) throws Exception {
    Map<String, Integer> wc =
            Files.lines(Paths.get( "assets/dunbarhotel"))
                    .map(Pattern.compile("\\p{Punct}")::matcher)
                    .map(matcher -> matcher.replaceAll(""))
                    .flatMap(Pattern.compile("\\s+")::splitAsStream)
                    .filter(Pattern.compile("^\\w+$").asPredicate())
                    .filter(s -> s.length() >= 2)
                    .map(s -> s.toLowerCase())
                    .collect(Collectors.groupingBy(w -> w,
                            Collectors.summingInt(w -> 1)));

    wc.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .limit(20)
            .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
  }
}