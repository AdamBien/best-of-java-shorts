import java.util.ArrayList;
import java.util.List;

interface App {

  static void main(String... args) {
    var list = new ArrayList<>();
    list.add("duke");
    var ulist = List.copyOf(list);
    ulist.add("java");
    System.out.println(ulist);

  }
}