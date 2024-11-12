import static java.util.Optional.ofNullable;

interface S0026_AttributeDefaultOptional {
  
  class Developer {
    private String name;
    private String language;

    public Developer(String name, String language) {
      this.name = ofNullable(name)
      .map(String::toUpperCase)
      .orElse("duke");
      this.language = ofNullable(language).orElse("j");
    }

    @Override
    public String toString() {
      return "Developer [name=" + name + ", language=" + language + "]";
    }
  }

  static void main(String... args) {
    var dev = new Developer(null, null);
    System.out.println(dev.toString());
  }
}