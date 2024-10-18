import java.io.IOException;

interface S21_TerminalReset {

  static void main(String... args) throws IOException {
    System.out.println("duke is not nice");
    System.out.print("\033c");
  }
}