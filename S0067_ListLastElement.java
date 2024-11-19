import java.util.List;

interface App {

  static void main(String... args) {
    var list = List.of("duke", "and", "java");
    var last = list.getLast();
    System.out.println(last);
    System.out.println(list.get(list.size()-1));

  }
}