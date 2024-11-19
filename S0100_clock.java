import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

interface App {

   static void main(String... args) {
    var clock = Clock.systemUTC();
    var instant = clock.instant();
    System.out.println(instant);
    var millis = clock.millis();
    System.out.println(millis);
  }
}