import java.util.List;
import java.util.stream.Collectors;

interface App {

  static void main(String... args) {
    var list = List.of("duke", "java", "jvm");
    var withCollector = list
        .stream()
        .collect(Collectors
            .joining(","));
    System.out.println(withCollector);
    var listString = String.join(",", list);
    System.out.println(listString);
  }
}