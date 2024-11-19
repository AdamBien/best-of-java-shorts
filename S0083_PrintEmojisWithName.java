import static java.lang.Character.getName;
import static java.lang.Character.toChars;
import java.util.stream.IntStream;

interface App {

  record Emoji(int codePoint) {
    String name() {
      return getName(codePoint)
          .toLowerCase();
    }

    String emoji() {
      return String.valueOf(toChars(codePoint));
    }

    public String toString() {
      return "%s -> %s".formatted(name(), emoji());
    }
  }

  static void main(String... args) {
    IntStream.range(0, Integer.MAX_VALUE)
        .filter(Character::isEmoji)
        .mapToObj(Emoji::new)
        .forEach(System.out::println);
  }
}