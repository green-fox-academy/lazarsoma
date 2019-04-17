import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class CopyFile {
  public static void main(String[] args) {
    readAndWriteFile("src/file.txt", "src/dest.txt");


  }

  public static void readAndWriteFile(String src, String dest) {
    try {
      Path srcPath = Paths.get(src);
      Path destPath = Paths.get(dest);
      Files.copy(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
      System.out.println("Could not copy the file!");
    } finally {
      System.out.println("The copy was successful");
    }
  }
}

