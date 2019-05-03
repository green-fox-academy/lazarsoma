import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class CopyFile {
  public static void main(String[] args) {
    readAndWriteFile("src/file.txt", "src/dest.txt");
  }

  public static boolean readAndWriteFile(String src, String dest) {
    try {
      Path srcPath = Paths.get(src);
      Path destPath = Paths.get(dest);
      Files.copy(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
      return true;
    } catch (IOException e) {
      System.out.println("Could not copy the file!");
      return false;
    }
  }
}

