import java.util.stream.Collectors;

public class FindTheUppercase {
  public static void main(String[] args) {
    String upper = "My Name Is".chars()
            .filter(Character::isUpperCase)
            .mapToObj(c -> Character.toString((char)c))
            .collect(Collectors.joining());
    System.out.println(upper);
  }
}
