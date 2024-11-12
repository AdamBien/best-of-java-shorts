import java.time.LocalDateTime;
import java.util.Objects;

public class S0027_ObjectsPreconditions {

    static String error() {
        return "input please now: " + LocalDateTime.now();
    }

    static void parameterPlease(String input) {
        Objects.requireNonNull(input, S0027_ObjectsPreconditions::error);
    }

    public static void main(String[] args) {
        parameterPlease(null);
    }
}