import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

interface S07_FileDiff {

  static void main(String... args) throws IOException {
    var first = Path.of("a.txt");
    var second = Path.of("b.txt");

    var firstDifferentByte = Files.mismatch(first, second);
    System.out.println(firstDifferentByte);
  }
}