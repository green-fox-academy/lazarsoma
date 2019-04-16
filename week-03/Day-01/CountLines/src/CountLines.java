import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountLines {
  public static void main(String[] args) throws IOException {
    System.out.println("Enter filename here : ");

    Scanner scanIn = new Scanner(System.in);
    String sFilename = scanIn.nextLine();

    System.out.println(sFilename);

    try {
      Path filePath = Paths.get("assets/filename.txt");
      FileReader fr = new FileReader(String.valueOf(filePath));
      LineNumberReader lnr = new LineNumberReader(fr);
      lnr.skip(Long.MAX_VALUE);
      System.out.println("The number of lines: " + lnr.getLineNumber());
    } catch (FileNotFoundException e) {
      System.out.println("zero");
    }
  }
}