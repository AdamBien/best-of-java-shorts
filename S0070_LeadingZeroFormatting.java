import static java.lang.System.out;
import java.util.stream.IntStream;

interface App {

  static void main(String... args) {
    IntStream.rangeClosed(0, 10)
        .mapToObj("%03d"::formatted)
        .forEach(out::println);
  }
}