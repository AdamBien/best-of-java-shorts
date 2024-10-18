import java.time.Duration;

interface App {

  static void main(String... args) 
  throws InterruptedException {
    System.out.println("good night");
    Thread.sleep(Duration.ofSeconds(1));
    System.out.println("good morning");
  }
}