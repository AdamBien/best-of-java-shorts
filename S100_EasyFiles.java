import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

interface App {

  static void main(String... args) throws IOException {
    var in = Path.of("./App.java");
    var out = Path.of("./AppUpper.java");
    var content = Files.readString(in).toUpperCase();
    Files.writeString(out,content);
  }
}