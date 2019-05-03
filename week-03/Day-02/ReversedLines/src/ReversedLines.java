import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    decrypt("assets/reversed-lines.txt");
  }
  public static void decrypt (String fileName) {
    try {
      Path file = Paths.get(fileName);
      List<String> lines = Files.readAllLines(file);
      List<String> newLines = new ArrayList<>();
      for (String s: lines) {
        StringBuilder sbf = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
          sbf.append(s.charAt(s.length()-i-1));
        }
        newLines.add(sbf.toString());
      }
      Files.write(file, newLines);

    } catch (IOException e) {
      System.out.println("The file can't be opened.");
    }
  }
}