interface App {

  static void main(String... args) {
    Message.print();
  }
}

interface Message {

  static void print() {
    System.out.println("have a nice day");
  }
}