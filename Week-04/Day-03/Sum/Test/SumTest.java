import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

  Sum s = new Sum();



  @Test
  public void sum() {

    int [] array = {2, 4, 7,3};
    assertEquals(16, s.sum(array));
  }

  @Test
  public void sumEmpty() {
    int [] array = {};
    assertEquals(null, s.sum(array));
  }

  @Test
  public void sumNull() {
    int[] array = {0};
    assertEquals(0, s.sum(array));
  }
}