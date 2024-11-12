import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

interface App {

  static void main(String... args) throws IOException {
    var path = Paths.get("./S0089_FileCreationTime.java");
    var at = Files.readAttributes(path, BasicFileAttributes.class);
    var creationTime = at.creationTime();
    System.out.println(creationTime);
  }
}