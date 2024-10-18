interface App {

  static void main(String... args) {
    var first = Boolean.parseBoolean("true");
    System.out.println(first);
    var second = Boolean.valueOf("true");
    System.out.println(second);
    Integer.parseInt("1");
    Integer.valueOf("1");

    Long.parseLong("1");
    Long.valueOf("1");

  }
}