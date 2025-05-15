import java.util.function.Consumer;
import java.util.stream.Stream;




interface S161_PlaingWithMapMulti {

  static void play(String content,
  Consumer<String> sink){
    System.out.println(content);
    sink.accept(content + " is great");
    sink.accept(content + " and java");
  }

  static void main(String... args) {
    var result = Stream
        .of("duke")
        .mapMulti(S161_PlaingWithMapMulti::play)
        .toList();
    System.out.println(result);
  }
}