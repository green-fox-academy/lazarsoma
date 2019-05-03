package SwearWords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwearWords {

  public static void main(String[] args) {
    ArrayList<String> swearWords = new ArrayList<>(Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss","cunt"));
    System.out.println(censor("content.txt",swearWords));
  }

  public static int censor(String file,List<String> removeableWords){
    Path filePath = Paths.get(file);
    int count = 0;

    try {
      List<String> content = Files.readAllLines(filePath);
      for (String element : content) {
        element = element.replace(".", "");
        for (String word : element.split(" ")) {
          for (String swear: removeableWords){
            if (word.equalsIgnoreCase(swear)){
              content.removeAll(Collections.singleton(swear));
              count++;
            }
          }
        }
      }
    } catch (IOException e) {
      System.out.println("File does not exist!");
    }
    return count;
  }
}

/*
Write a method which can read and parse a file containing not so family friendly text.
The method must remove all the given words from the file and return the amount of the removed words.

Input
'fuck', - 2
'bloody', - 4
'cock', - 2
'shit', - 1
'fucker', - 1
'fuckstick', - 2
'asshole', - 2
'dick', - 2
'piss', - 1
'cunt' - 1

Output
17
 */