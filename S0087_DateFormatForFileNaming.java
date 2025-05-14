import static java.lang.System.out;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

interface App {

  static void main(String... args) {
    var date = LocalDateTime
    .now()
    .format(DateTimeFormatter.ofPattern("yyyy_MM_dd"));
    out.println(date);
  }
}