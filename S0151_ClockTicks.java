import java.time.Clock;
import java.time.ZoneId;

interface App {

  static void main(String... args) throws InterruptedException {
    var clock = Clock.systemDefaultZone();
    System.out.println(clock.millis());
    Thread.sleep(50);
    System.out.println(clock.millis());
    clock = Clock.tickSeconds(ZoneId.systemDefault());
    Thread.sleep(50);
    System.out.println(clock.millis());
    Thread.sleep(50);
    System.out.println(clock.millis());
  }
}