import java.util.List;
import java.util.stream.Stream;

public class S0054_StreamConcat {

  public static void main(String[] args) {
    var first = List.of("1", "2").stream();
    var second = List.of("3", "4").stream();
    // result = first + second
    var result = Stream.concat(first, second).toList();
    System.out.println(result);
  }

}