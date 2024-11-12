import java.nio.file.Files;
import static java.nio.file.Path.*;
import java.io.IOException;

interface S0037_FileCopy {
  static void main(String... args) throws IOException {
    Files.copy(of("App.java"), of("App.next"));
  }

}