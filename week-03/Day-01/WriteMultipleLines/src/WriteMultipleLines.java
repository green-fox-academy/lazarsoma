import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class WriteMultipleLines {
  public static void main(String[] args) {
    writeWords("file.txt", "apple", 5);

  }

  public static void writeWords(String fileName, String word, int n) {
    try {
      Path filePath = Paths.get(fileName);
      ArrayList<String> list = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        list.add(word);
      }
      Files.write(filePath, list);
    } catch (Exception e) {
      System.out.println("Unable to write file.");
    }
  }
}