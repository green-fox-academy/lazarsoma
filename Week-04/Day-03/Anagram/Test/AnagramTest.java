import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void isAnagram() {
    Anagram anagram = new Anagram();
    assertEquals(true, anagram.isAnagram("koszosőzdiátnyel","KosztolányiDezső"));
  }

  @Test
  public void isnotAnagram() {
    Anagram anagram = new Anagram();
    assertEquals(true, anagram.isAnagram("marad","dara"));
  }
}