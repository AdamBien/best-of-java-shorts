import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;




interface S164_TimeoutWithFuture {

  static String slow() {
    try {
      Thread.sleep(Duration.ofMillis(500));
      System.out.println("calculated");
      return "calculated: 42";
    } catch (InterruptedException e) {
    }
    return "answer is not known";
  }

  static void main(String... args) throws Exception {
    System.out.println("before");
    Future<String> future = Executors
    .newSingleThreadExecutor()
    .submit(S164_TimeoutWithFuture::slow);
    System.out.println("some work");
    var result = future.get(300,TimeUnit.MILLISECONDS);
    System.out.println(result);

  }
}