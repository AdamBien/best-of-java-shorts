interface App {

  static void main(String... args) {
    var isLowerCase = "heyduke"
    .chars()
    .allMatch(Character::isLowerCase);

    System.out.println(isLowerCase);

  }
}