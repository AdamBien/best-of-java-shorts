interface App {

  static void main(String... args) {
    System.out.println("hello");
    {
      var message = "world";
      System.out.println(message);
    }
    System.out.println(message);
  }
}