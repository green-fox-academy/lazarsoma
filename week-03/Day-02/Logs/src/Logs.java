import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class Logs {
  public static void main(String[] args) {

    IP("assets/log.txt");

  }

  public static void IP(String fileName) {

    try {

      Path filePath = Paths.get(fileName);
      List<String> lines = Files.readAllLines(filePath);
      ArrayList<String> IPs = new ArrayList<>();
      ArrayList<String> UniqueIPs = new ArrayList<>();
      for (String line : lines) {
        System.out.println(line);
        IPs.add(line.substring(27, 38));
      }
      for (String str : IPs) {
        if (!UniqueIPs.contains(str)) {
          UniqueIPs.add(str);
        }
      }
      System.out.println(UniqueIPs);
      System.out.println(UniqueIPs.size());

    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}


