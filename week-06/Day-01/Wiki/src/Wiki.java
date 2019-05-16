import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Wiki {

  public static void main(String args[]) {

  /*  String fileName = "assets/dunbarhotel";
    List<String> list = new ArrayList<>();
    (Stream<String> stream = Files.lines(Paths.get(fileName)))*/

    try  {
      /*list = stream.collect(Collectors.toList());
      Map<String, Integer> words = list.stream()
              .flatMap(map ->Arrays.stream(map.split(" ")))
              .filter(word -> !word.equals(""))
              .map(word -> word.replace(".", ""))
              .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(str -> 1)))
              .entrySet()
              .stream()
              .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
              .limit(100)
              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));*/
      Map<String, Integer> wc =
              Files.lines(Paths.get("/tmp", "assets/dunbarhotel"))
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
              .limit(5)
              .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));


    } catch (IOException e) {
      e.printStackTrace();
    }

    //list.forEach(System.out::println);


  }

}
