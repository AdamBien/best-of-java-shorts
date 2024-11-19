import java.time.DayOfWeek;
import java.time.Month;
import java.util.stream.Stream;

interface App {

  static void main(String... args) {
    var day = DayOfWeek.of(1).plus(2);
    System.out.println(day);
  }
}