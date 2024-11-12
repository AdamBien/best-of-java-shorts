interface S0127_ContentEqualsOverEquals {

  static void main(String... args) {
    var first = "duke";
    var second = new StringBuilder("duke");
    System.out.println(first.contentEquals(second));
  }
}