import java.util.function.Consumer;
import java.util.stream.Stream;

interface S56_MapMulti {

  // 1 -> n
  static void expand(String csv,
      Consumer<String> sink) {
    for (var e : csv.split(","))
      sink.accept(e);
  }

  static void main(String... args) {
    var csv = Stream
        .of("hello,world",
            "duke,java");
    var expanded = csv
        .mapMulti(S56_MapMulti::expand)
        .toList();
    System.out.println(expanded);
  }
}