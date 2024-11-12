import java.util.Base64;

interface App {


  static void main(String... args) {
    var message = "JAVA_HOME"
    .transform(System.getenv()::get);
    System.out.println(message);
  }
}