import java.time.LocalDateTime;
import java.util.stream.Stream;

interface S0039_EndlessStreams {

  static void main(String... args) {
    var dates = Stream
        .generate(LocalDateTime::now)
        .map(LocalDateTime::toString)
        .limit(100) // remove to experience infinity
        .toList();
    System.out.println(dates);

  }
}
