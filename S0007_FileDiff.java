import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

interface S0007_FileDiff {

  static void main(String... args) throws IOException {
    var first = Path.of("S0000_BoringMain.java");
    var second = Path.of("S0001_Executable.java");

    var firstDifferentByte = Files.mismatch(first, second);
    System.out.println(firstDifferentByte);
  }
}