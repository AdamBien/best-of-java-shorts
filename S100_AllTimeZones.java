import java.time.ZoneId;

interface App {

  static void main(String... args) {
    ZoneId
    .getAvailableZoneIds()
    .forEach(System.out::println);

  }
}