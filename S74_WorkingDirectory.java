import java.nio.file.Path;

interface App {

  static void main(String... args) {
    var workingDirectory = Path
        .of("")
        .toAbsolutePath();
    System.out.println(workingDirectory);
  }
}