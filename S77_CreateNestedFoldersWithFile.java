import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

interface App {

  static void main(String... args) throws IOException {
    var path = Path.of("a", "b", "c");
    var fileName = "deep.txt";
    var content = "deep content";
    var nestedPath = Files.createDirectories(path);
    Files.writeString(nestedPath.resolve(fileName),content);
  }
}