import java.util.List;

interface App {

  static void main(String... args) {
    var nestedList = List.of(
      List.of(1,2),
      List.of(3,4),
      List.of(5,6)
    );

    var flatList  = nestedList
    .stream()
    .flatMap(List::stream)
    .toList();
    System.out.println(flatList);
  }
}