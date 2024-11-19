import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;

interface App {

  static void main(String... args) {
    TemporalQuery<Integer> query = t -> t.get(ChronoField.YEAR);
    var date = LocalDate
      .of(42, Month.JANUARY, 15)
      .query(query);
    System.out.println(date);
  }
}