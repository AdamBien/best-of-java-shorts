import java.util.HexFormat;
import java.util.stream.Collectors;

interface App {

  static void main(String... args) {
    var hexNumber =  """
        CAFEBABE\
        BABECAFE\
        """;
    var parsed = HexFormat
        .of()
        .parseHex(hexNumber);
    System.out.println(parsed.length);
  }
}