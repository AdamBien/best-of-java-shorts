import java.time.Instant;

interface App {

  static void main(String... args) {
    var instant = Instant.parse("2024-12-12T10:00:00Z");
    System.out.println(instant);
  }
}