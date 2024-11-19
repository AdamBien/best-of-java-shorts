public class S0018_InitializersAndConstructors {

    public S0018_InitializersAndConstructors() {
        System.out.println("parameterless");
    }

    public S0018_InitializersAndConstructors(String name) {
        System.out.println(name);
    }

    {
        System.out.println("shared code");
    }
  

    public static void main(String[] args) {
        new S0018_InitializersAndConstructors();
        new S0018_InitializersAndConstructors("with parameter");
    }
}