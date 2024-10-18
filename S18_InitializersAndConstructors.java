public class S18_InitializersAndConstructors {

    public S18_InitializersAndConstructors() {
        System.out.println("parameterless");
    }

    public S18_InitializersAndConstructors(String name) {
        System.out.println(name);
    }

    {
        System.out.println("shared code");
    }
  

    public static void main(String[] args) {
        new S18_InitializersAndConstructors();
        new S18_InitializersAndConstructors("with parameter");
    }
}