import java.util.List;
import java.util.Arrays;

interface App {

  static void main(String... args) {
    var backing = new String[]{"java","duke"};
    var developers = Arrays.asList(backing);
    System.out.println(developers);
    backing[0] = "james";
    System.out.println(developers);
    System.out.println(backing[0]);

    //List.of("java","duke").add("james");
  }
}