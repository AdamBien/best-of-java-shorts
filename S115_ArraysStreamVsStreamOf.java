import java.util.Arrays;
import java.util.stream.Stream;

interface App {

  static void numbers(int... numbers) {
    var attempt = Stream
        .of(numbers)
        .toList();
    System.out.println(attempt);
    var result = Arrays.stream(numbers)
    .boxed()
    .toList();
    System.out.println(result);
  }

  static void main(String... args) {
    numbers(2, 4, 42,13);
  }
}