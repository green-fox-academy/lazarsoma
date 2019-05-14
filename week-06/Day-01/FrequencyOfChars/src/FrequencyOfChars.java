import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FrequencyOfChars {
  public static void main(String[] args) {
    String myString = "LazarSoma";
    char[] chars = myString.toCharArray();
    System.out.println(Arrays.asList(chars)
            .stream()
            .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
    //System.out.println();
  }
}
