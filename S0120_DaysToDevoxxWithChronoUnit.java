import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

interface App {

  static boolean isWorkday(LocalDate date) {
    var day = date.getDayOfWeek();
    return day != DayOfWeek.SATURDAY 
    && day != DayOfWeek.SUNDAY;
  }

  static void main(String... args) {
    var now = LocalDate.now();
    var devoxx = LocalDate
    .of(2025, Month.OCTOBER, 6);
    var days = ChronoUnit.DAYS
    .between(now, devoxx);
    System.out.println(days);
  }
}