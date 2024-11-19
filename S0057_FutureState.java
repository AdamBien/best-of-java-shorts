import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

interface S0057_FutureState {

  static String slowMessage() {
    try {
      TimeUnit.MILLISECONDS.sleep(500);
    } catch (InterruptedException e) {
    }
    return "dukeGPT";
  }

  static void main(String... args) throws InterruptedException, ExecutionException {
    var future = Executors
        .newCachedThreadPool()
        .submit(S0057_FutureState::slowMessage);

    System.out.println(future.state());
    TimeUnit.SECONDS.sleep(1);
    System.out.println(future.state());
    System.out.println(future.get());

  }
}