import java.util.Optional;

interface App {

  static Optional<Integer> toIntIf(Object value) {
    if (value instanceof Integer number) {
      return Optional.of(number);
    }
    return Optional.empty();
  }

  static Optional<Integer> toIntSwitch(Object value) {
    return switch (value) {
      case Integer number -> Optional.of(number);
      default -> Optional.empty();
    };
  }

  static void main(String... args) {
    toIntSwitch(null)
        .ifPresent(System.out::println);
  }
}