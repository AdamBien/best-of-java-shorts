import static java.lang.System.out;
import java.util.stream.Stream;

interface S0124_StringConcatWithReduce {

  static void main(String... args) {
    var result = Stream
    .of("Hello","Java","Duke")
    .reduce(String::concat)
    .orElse("");
    out.println(result);

  }
}