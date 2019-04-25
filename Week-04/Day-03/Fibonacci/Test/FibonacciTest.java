import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  @Test
  public void fibonacci() {

    Fibonacci fib = new Fibonacci();

    assertEquals(2, fib.fibonacci(3));
  }
}