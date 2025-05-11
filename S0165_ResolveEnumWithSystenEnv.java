import static java.lang.System.out;

interface S0165_ResolveEnumWithSystenEnv {

  enum S0165_ResolveEnumWithSystenEnvConfig {
    JAVA_HOME;

    String value(){
      return System.getenv(this.name());
    }
  }

  static void main(String... args) {
    out.println(S0165_ResolveEnumWithSystenEnvConfig.JAVA_HOME.value());
  }
}