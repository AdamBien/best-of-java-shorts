import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.IntStream;

interface App {

    static void main(String... args) {
        var numbers = IntStream
                .range(0, 100_000_000)
                .boxed()
                .toList();

        var start = Instant.now();
        var result = numbers
                .parallelStream()
                .filter(n -> n % 2 != 0)
                .toList();
        var duration = Duration
                .between(start, Instant.now())
                .toMillis();
        System.out.println("stream %d in %dms"
                .formatted(result.size(), duration));
        /* museum */
        start = Instant.now();
        var lResult = new LinkedList<>();
        for (var number : numbers) {
            if (number % 2 != 0) {
                lResult.add(number);
            }
        }
        duration = Duration
                .between(start, Instant.now())
                .toMillis();
        System.out.println("for %d in %dms"
                .formatted(lResult.size(), duration));
    }
}