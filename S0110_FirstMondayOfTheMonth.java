import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.stream.*;

interface App {

  static LocalDate firstMondayOfTheMonth(Month month){
    return LocalDate
        .of(2027, month, 1)
        .with(TemporalAdjusters
        .firstInMonth(DayOfWeek.MONDAY));

  }

  static void main(String... args) {
    Stream.of(Month.values())
    .map(App::firstMondayOfTheMonth)
    .forEach(System.out::println);
  }
}