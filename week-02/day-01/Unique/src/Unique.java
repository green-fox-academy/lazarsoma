import java.util.Arrays;
import java.util.stream.IntStream;

public class Unique {
  public static void main(String[] args) {


    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    System.out.println(Arrays.toString(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34})));
    //  should print: `[1, 11, 34, 52, 61]`

    IntStream.of(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34})).distinct().forEach(System.out::println); //other way

  }

  public static int[] unique (int[] list) {
    int[] noDuplicates = IntStream.of(list).distinct().toArray();
    return noDuplicates;

  }
}