import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

interface S0005_ScheduledThreadPool {

  static void main(String... args) {
    var scheduler = Executors.newScheduledThreadPool(1);
    scheduler
        .scheduleAtFixedRate(() -> System.out.println("hello"), 0, 1, TimeUnit.SECONDS);
  }
}