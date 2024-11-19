interface S0003_VarArgs {

  static void hello(String... messages) {
    for (var message : messages) {
      System.out.println(message);
    }
  }

  static void main(String... args) {
    S0003_VarArgs.hello("hey", "duke", "java");
    S0003_VarArgs.hello("is", "working");
    S0003_VarArgs.hello(new String[] { "is", "always", "working" });
  }
}