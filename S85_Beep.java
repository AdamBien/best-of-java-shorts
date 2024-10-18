import java.awt.Toolkit;

interface App {

  static void main(String... args) {
    //Toolkit.getDefaultToolkit().beep();
    System.out.println("\u0007");
  }
}