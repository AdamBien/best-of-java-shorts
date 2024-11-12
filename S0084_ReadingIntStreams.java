import java.util.Scanner;

interface App {

  static void main(String... args) {
    try (var s = new Scanner(System.in)) {
      while(s.hasNextInt()){
        System.out.println("> " + s.nextInt());
      }
    } 
  }
}