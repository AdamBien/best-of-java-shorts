import java.util.Map;
import static java.util.Map.entry;

interface App {

  static void main(String... args) {
    var map = Map.ofEntries(
      entry("1","one"),
      entry("2","one"),
      entry("4","one")
    );
    System.out.println(map);
  }
}