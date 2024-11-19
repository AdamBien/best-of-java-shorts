public class S0016_AutoCloseable implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("closing");
    }

    public static void main(String[] args) {
        try (var a = new S0016_AutoCloseable()) {
        }
    }

}
