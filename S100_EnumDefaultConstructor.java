interface App {
  enum Devs {
    DUKE, 
    JAMES;
    String firstName;
    Devs() {
      this.firstName = name().toLowerCase();
    }
    String firstName() {
      return this.firstName;
    }
  }
  static void main(String... args) {
    var name = Devs.DUKE.firstName();
    System.out.println(name);
  }
}