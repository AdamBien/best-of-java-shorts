import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

interface App {

  static void main(String... args) {
    var ds = "2024-07-14T06:04:25.941258587";
    var ldt = LocalDateTime
        .parse(ds);
    var instant = ldt
        .toInstant(ZoneOffset.UTC);
    System.out.println("LDT    : " + ldt);
    System.out.println("Instant: " + instant);
  }
}