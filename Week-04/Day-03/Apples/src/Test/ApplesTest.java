import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ApplesTest {

  @Test
  public void getApple() {

    Apples apples = new Apples();
    assertEquals("Peach", apples.getApple());
  }
}
