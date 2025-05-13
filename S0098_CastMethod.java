import java.util.Date;

interface App {

  static void main(String... args) throws Exception {
    var instance = Class
        .forName("java.util.Date")
        .getDeclaredConstructor()
        .newInstance();
    var duke = Date.class.cast(instance);
  System.out.println(duke.getTime()); 
  }
}