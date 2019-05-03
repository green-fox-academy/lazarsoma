import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as a parameter
    // The file contains an ended Tic-Tac-Toe match
    // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
    // Return "X", "O" or "Draw" based on the input file

    ticTacResult("assets/win-o.txt");
    // Should print "O"

    ticTacResult("assets/win-x.txt");
    // Should print "X"

    ticTacResult("assets/draw.txt");
    // Should print "Draw"
  }

  public static void ticTacResult(String fileName) {

    int x = 0;
    int o = 0;


    try {
      Path file = Paths.get(fileName);
      List<String> lines = Files.readAllLines(file);
      for (String s : lines) {
        for (int i = 0; i < s.length(); i++) {
          if (s.charAt(i) == 'O') {
            o++;
          }
        }
      }
      for (String s : lines) {
        for (int i = 0; i < s.length(); i++) {
          if (s.charAt(i) == 'X') {
            x++;
          }
        }
      }
      if (o > x) {
        System.out.println("O");
      } else if (o == x) {
        System.out.println("Draw");
      } else {
        System.out.println("X");
      }
    } catch (IOException e) {
      System.out.println("The file can't be opened.");
    }
  }
}