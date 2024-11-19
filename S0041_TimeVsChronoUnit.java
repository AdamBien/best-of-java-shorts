import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

interface S0041_TimeVsChronoUnit {

  static void main(String... args) throws InterruptedException {
    System.out.println("what's the difference?");
    var tu = TimeUnit.SECONDS;
    tu.sleep(2);
    var cu = ChronoUnit.SECONDS;
  }
}