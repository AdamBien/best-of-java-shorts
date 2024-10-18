interface App {
  // java -XX:AutoBoxCacheMax=128 app.java
  static void main(String... args) {
    var number = 129;
    var first = Integer.valueOf(number);
    var second = Integer.valueOf(number);
    System.out.println(first.equals(second));
  }
}