import java.util.Optional;

interface App {

  static Optional<String> first(String input) {
    var message = "first " + input;
    return Optional.of(message);
  }

  static Optional<String> second(String input) {
    var message = "second " + input;
    return Optional.of(message);
  }

  static Optional<String> last(String input) {
    var message = "last " + input;
    return Optional.of(message);
  }

  static void main(String... args) {
    var result = 
    first("duke")
    .flatMap(App::second)
    .flatMap(App::last)
    .orElse("-empty-");
    System.out.println(result);
  }
}