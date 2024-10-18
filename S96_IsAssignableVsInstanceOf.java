interface App {


  static void main(String... args) {
    var dev = "duke".getClass();
    if (dev.isAssignableFrom(String.class))
      System.out.println("true");
  }
}