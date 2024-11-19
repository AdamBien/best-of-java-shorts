import java.time.Instant;

interface App {

  static void main(String... args) {
    var date = Instant
    .now()
    .toString();

    System.out.println(date);
  }
}