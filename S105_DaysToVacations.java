import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

interface App {

  static void main(String... args) {
    var now = LocalDate.now();
    var j1 =LocalDate.of(2025, Month.MARCH, 18);
    var days = ChronoUnit.DAYS.between(now, j1);
    System.out.println(days);
  }
}