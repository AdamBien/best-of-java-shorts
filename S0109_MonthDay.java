import java.time.MonthDay;
import java.time.Month;

interface App {

  static void main(String... args) {
    var j1 = MonthDay.of(Month.JANUARY, 1);
    System.out.println(j1);
    var result = MonthDay.now().isBefore(j1);
    System.out.println(result);
  }
}