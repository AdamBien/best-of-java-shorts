import java.util.stream.Stream;
import java.util.stream.Collectors;

interface S0124_StringConcatWithReduce {

  static void main(String... args) {
    var result = Stream
    .of("Hello","Java","Duke")
    .reduce(String::concat)
    .orElse("");
    System.out.println(result);

  }
}