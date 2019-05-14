import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateChars {
  public static void main(String[] args) {
    List<Character> chars = Arrays.asList('L', 'a', 'z', 'a', 'r', 'S','o', 'm','a');
    String myString = chars.stream()
            .map(String :: valueOf)
            .collect(Collectors.joining());
    System.out.println(myString);
  }
}
