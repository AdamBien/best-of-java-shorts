interface S0172_CharOccurences {

  static void main(String... args) {
    var occurences = "hello, duke"
    .chars()
    .filter(l -> l == 'l')
    .count();
    System.out.println(occurences);
  }
}