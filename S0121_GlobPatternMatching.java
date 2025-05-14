import static java.lang.System.out;
import java.nio.file.FileSystems;
import java.nio.file.Path;

interface S0121_GlobPatternMatching {

  static void main(String... args) {
    var fs = FileSystems.getDefault();
    var matcher = fs
        .getPathMatcher("glob:*duke");
    out.println(matcher.matches(Path.of("jsduke")));
    out.println(matcher.matches(Path.of("jduke")));
    out.println(matcher.matches(Path.of("dukes")));
  }
}