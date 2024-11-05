import static java.lang.System.out;

interface App {

  static void main(String... args) {
    var rs = new Runnable[]{
      ()-> out.println(1),
      ()-> out.println(2)
      
    };
    for (int i = 0; i < rs.length; i++) {
      rs[i].run();
    }


  }
}