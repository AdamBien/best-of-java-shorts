import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

interface App {
  

  static void main(String... args) throws InterruptedException {
    var latch = new CountDownLatch(1);
    latch.countDown();
    latch.await(500, TimeUnit.MILLISECONDS);
    System.out.println("after");
  }
}