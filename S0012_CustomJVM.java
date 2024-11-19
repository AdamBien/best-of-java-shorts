public interface S0012_CustomJVM {

    /**
     * javac
     * jdeps
     * jlink --add-modules java.base --output cobad
     */
    static void main(String... args) {
        System.out.println("hello, duke");
    }
}