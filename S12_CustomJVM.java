public interface S12_CustomJVM {

    /**
     * javac
     * jdeps
     * jlink --add-modules java.base --output cobad
     */
    static void main(String... args) {
        System.out.println("hello, duke");
    }
}