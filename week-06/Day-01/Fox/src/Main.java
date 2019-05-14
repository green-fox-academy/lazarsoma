import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Fox> foxes = Arrays.asList(
            new Fox("Fox1", "red", 1),
            new Fox("Fox2", "green", 3),
            new Fox("Fox3", "white", 5),
            new Fox("Fox4", "green", 7),
            new Fox("Fox5", "black", 9));

    /*foxes.parallelStream()
            .filter(f -> f.color == "green")
            .filter(f -> f.color == "green" && f.age < 5)
            .collect(Collectors.groupingBy((Fox f)-> f.color));*/

    foxes.stream().filter(f -> f.color == "green").forEach(f -> System.out.println(f.name));
    foxes.stream().filter(f -> f.color == "green" && f.age < 5).forEach(f -> System.out.println(f.name));
    System.out.println(foxes.stream().collect(Collectors.groupingBy( f -> f.color, Collectors.mapping(f -> f.name, Collectors.toSet()))));
  }
}
