import java.util.List;

public class S0045_Peek {
  public static void main(String[] args) {
    var result = List.of("a", "b", "c")
        .stream()
        .filter(s -> s.startsWith("b"))
        .peek(System.out::println)
        .map(s -> "*" + s)
        .peek(System.out::println)
        .toList();
  }
}