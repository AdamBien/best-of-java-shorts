import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

interface S131_ReadClassVersion {

  static void main(String... args) throws IOException {
    var classPath = Path.of("S131_ReadClassVersion.class");
    var version = Files.readAllBytes(classPath)[7];
    System.out.println(version);

  }
}