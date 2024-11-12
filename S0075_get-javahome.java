interface App {

  static void main(String... args) {
    var home = System.getProperty("java.home");
    System.out.println(home);
    home = System.getenv().get("JAVA_HOME");
    System.out.println(home);
  }
}