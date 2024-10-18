import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

interface App {

  static void main(String... args) {
    BinaryOperator<Integer> multi  = (a,b) -> a*b;
    System.out.println(multi.apply(2, 21));
  }
}