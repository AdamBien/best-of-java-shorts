import static java.lang.System.out;
import java.util.stream.Stream;

interface App {

  static void main(String... args) {
    Stream.iterate(0, i -> i + 2)
        .limit(10)
        .forEach(out::println);
  }
}