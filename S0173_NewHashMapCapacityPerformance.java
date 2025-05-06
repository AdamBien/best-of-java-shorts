import java.util.HashMap;
import static java.time.Instant.now;
import static java.text.NumberFormat.getCompactNumberInstance;
import static java.time.Duration.between;
import static java.lang.System.out;

interface S0173_NewHashMapCapacityPerformance {

  static void main(String... args) {
    var iterations = 10_000_000;
    var map = HashMap.newHashMap(iterations);
    var start = now();
    for (int i = 0; i < iterations; i++) {
      map.put(i, i);
    }
    out.println(between(start,now()));
    var iterationsString = getCompactNumberInstance()
    .format(map.size());
    out.println(iterationsString);
  }
}