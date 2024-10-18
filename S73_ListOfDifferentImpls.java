import java.util.List;

interface App {

  static void main(String... args) {
    var two = List.of(1,2);
    var three = List.of(1,2,3);
    System.out.println(two.getClass());
    System.out.println(three.getClass());
  }
}