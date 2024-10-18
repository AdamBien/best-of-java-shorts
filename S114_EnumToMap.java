import java.util.stream.Collectors;
import java.util.stream.Stream;

interface App {

  enum Sizes{
    S(1),
    M(2),
    L(3);
    private final int size;

    Sizes(int size){
      this.size = size;
    }
    int size(){
      return this.size;
    }
  }

  static void main(String... args) {
    var sizesAsMap = Stream.of(Sizes.values())
    .collect(Collectors
    .toMap(Sizes::name,Sizes::size));
    System.out.println(sizesAsMap);
  }
}