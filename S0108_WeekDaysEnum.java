import static java.lang.System.out;
import java.time.DayOfWeek;

interface App {

  static void main(String... args) {
    var day = DayOfWeek.of(1).plus(2);
    out.println(day);
  }
}