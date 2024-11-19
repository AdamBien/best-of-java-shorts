import java.nio.file.FileSystems;
import java.nio.file.Path;

interface S0121_GlobPatternMatching {

  static void main(String... args) {
    var fs = FileSystems.getDefault();
    var matcher = fs
    .getPathMatcher("glob:*duke");
    System.out.println(matcher.matches(Path.of("jsduke")));
    System.out.println(matcher.matches(Path.of("jduke")));
    System.out.println(matcher.matches(Path.of("dukes")));
  }
}