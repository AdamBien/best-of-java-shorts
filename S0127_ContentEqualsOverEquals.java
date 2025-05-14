import static java.lang.System.out;
interface S0127_ContentEqualsOverEquals {

  static void main(String... args) {
    var first = "duke";
    var second = new StringBuilder("duke");
    out.println(first.contentEquals(second));
  }
}