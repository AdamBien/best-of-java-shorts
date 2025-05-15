import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;



interface S163_TimeoutMethodsWithCompletableFuture {

  static String slow(){
    try {
      Thread.sleep(Duration.ofSeconds(1));
      return "calculated: 42";
    } catch (InterruptedException e) {}
    return "answer is not known";
  }

  static void main(String... args) throws InterruptedException {
    var answer = CompletableFuture
    .supplyAsync(S163_TimeoutMethodsWithCompletableFuture::slow)
    .completeOnTimeout("timeout", 200, TimeUnit.MILLISECONDS)
    .join();
    System.out.println(answer);
  }
}