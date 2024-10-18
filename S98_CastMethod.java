interface App {

  static void main(String... args) throws Exception {
    var instance = Class
        .forName("Duke")
        .getDeclaredConstructor()
        .newInstance();
    var duke = Duke.class.cast(instance);
  System.out.println(duke.statement()); 
  }
}