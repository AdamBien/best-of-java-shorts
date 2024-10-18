import java.util.stream.Stream;

interface App {
  class Garbage {
    void hello() {
      System.out.print(".");
    }

    @Override
    public void finalize(){
      System.out.println("clean");
    }
  }

  static void main(String... args) {
    Stream
        .generate(Garbage::new)
        .limit(1_000_000)
        .forEach(Garbage::hello);
  }
}