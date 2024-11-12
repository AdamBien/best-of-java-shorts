import java.text.ListFormat;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

interface App {

  static void main(String... args) {
    var list = List.of("java", "duke", "fun");
    Locale.setDefault(Locale.GERMAN);
    var message =ListFormat
    .getInstance()
    .format(list);
    System.out.println(message);
  }
}