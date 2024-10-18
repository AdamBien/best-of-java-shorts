import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

interface App {

  static void main(String... args) {
    var now = LocalDate.now();
    var javaONE = LocalDate.of(2025, Month.MARCH, 18);
    var days = now.datesUntil(javaONE).count();
    System.out.println(days);
  }
}