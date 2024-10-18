import java.lang.ref.Cleaner;
import java.util.stream.Stream;

interface App {
  static Cleaner cleaner = Cleaner.create();
  class Garbage {
    Garbage(){
      cleaner.register(this, this::clean);
    }
    void clean(){
      System.out.println("clean");
    }
    void hello() {
      System.out.print(".");
    }
  }

  static void main(String... args) {
    Stream
        .generate(Garbage::new)
        .limit(1_000_000)
        .forEach(Garbage::hello);
  }
}