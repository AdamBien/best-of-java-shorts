import java.util.stream.Collectors;

interface App {

  static void main(String... args) {
    var csv = """
        Mr. Duke
        JavaOne Avenue
        4242 Javapolis
        """.lines()
        .collect(Collectors.joining(","));
    System.out.println(csv);
  }
}