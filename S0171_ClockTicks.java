import static java.lang.System.out;
import static java.lang.Thread.sleep;
import java.time.Clock;
import java.time.ZoneId;

interface App {

  static void main(String... args) throws InterruptedException {
    var clock = Clock.systemDefaultZone();
    out.println(clock.millis());
    sleep(50);
    out.println(clock.millis());
    clock = Clock.tickSeconds(ZoneId.systemDefault());
    sleep(50);
    out.println(clock.millis());
    sleep(50);
    out.println(clock.millis());
  }
}