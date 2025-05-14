import java.util.Arrays;
import java.util.stream.Stream;
import static java.lang.System.out;

interface App {

  static void numbers(int... numbers) {
    var withOf = Stream
        .of(numbers)
        .toList();
    out.println(withOf);

    var withStream = Arrays
        .stream(numbers)
        .boxed()
        .toList();
    out.println(withStream);
  }

  static void main(String... args) {
    numbers(2, 4, 42, 13);
  }
}