import java.util.stream.Stream;




interface Sorry {
  static void main(String... args) {
    Stream.generate(()->"Sorry babu")
    .limit(1001)
    .forEach(System.out::println);
  }
}