import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

interface App {

  static int slow() {
    try {
      TimeUnit.MILLISECONDS.sleep(100);
    } catch (InterruptedException e) {
    }
    return 1;
  }

  static void run(){
    var start = Instant.now();
    var count = Stream
        .generate(App::slow)
        .parallel()
        .limit(10)
        .count();
    System.out.println("count: " + count);

    var duration = Duration
        .between(start, Instant.now())
        .toMillis();
    System.out.println("%dms"
        .formatted(duration));

  }

  static void main(String... args) throws Exception {
    System
        .setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "16");
        try(var pool = new ForkJoinPool(1)){
          pool.submit(()->run()).get();

        }
  }
}