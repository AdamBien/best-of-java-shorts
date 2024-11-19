import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

interface App {

  static void main(String... args) throws IOException {
    var classPath = Path.of("App.class");
    var version = Files.readAllBytes(classPath)[7];
    System.out.println(version);

  }
}