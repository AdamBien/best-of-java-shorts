import static java.lang.System.out;
interface S0172_CharOccurences {

  static void main(String... args) {
    var occurences = "hello, duke"
    .chars()
    .filter(c -> c == 'l')
    .count();
    out.println(occurences);
  }
}