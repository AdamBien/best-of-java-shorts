import java.util.Arrays;

interface App {

  @interface Dev{}

  static void main(String... args) {
    var superclass = Dev.class.getInterfaces();
    System.out.println(Arrays.toString(superclass));
  }
}