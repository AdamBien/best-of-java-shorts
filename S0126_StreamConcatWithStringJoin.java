import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

interface S0126_StreamConcatWithStringJoin {

  static void main(String... args) {
    var result = List
    .of("Hello","Java","Duke");

    System.out.println(String.join(",",result));
  }
}