interface App {

  public enum Log {

    INFO("\033[0;33m"),
    ERROR("\033[0;41m");

    final String value;
    final String RESET = "\u001B[0m";

    private Log(String value) {
      this.value = (value + "%s" + RESET);
    }

    public void out(String message) {
      stdout(formatted(message));
    }

    String formatted(String raw) {
      return this.value.formatted(raw);
    }

    void stdout(String message) {
      System.out.println(message);
    }
  }

  static void main(String... args) {
   Log.INFO.out("Hello, duke"); 
   Log.ERROR.out("danger"); 
  }
}