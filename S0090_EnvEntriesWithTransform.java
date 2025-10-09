void main() {
  var message = "JAVA_HOME"
      .transform(System.getenv()::get);
  System.out.println(message);
}
