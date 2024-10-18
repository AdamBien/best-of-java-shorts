import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

interface App {

  static void main(String... args) 
  throws IOException {
    var dir = Path.of(".");
    var files = Files.list(dir)
    .map(Path::toString)
    .filter(f -> f.endsWith(".txt"))
    .sorted()
    .toList();
    System.out.println(files);
  }
}