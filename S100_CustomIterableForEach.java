import java.util.Iterator;

interface App {
  static Iterable<Long> numbers() {
    return new Iterable<Long>() {

      public Iterator<Long> iterator() {
        return new Iterator<Long>() {

          public boolean hasNext() {
            return true;
          }

          public Long next() {
            try {
              Thread.sleep(500);
            } catch (InterruptedException e) {}
            return System.currentTimeMillis();
          }
        };

      }
    };
  }

  static void main(String... args) {
    var numbers = numbers();
    for (Long number : numbers) {
      System.out.println(number);
    }
  }
}