import static org.junit.Assert.assertEquals;

public class CountLetters {

  public void countLetters() {
    String string = "LazarSoma";
    char someChar = 'a';
    int count = 0;

    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == someChar) {
        count++;
        System.out.println(count);
      }
    }
  }
}
