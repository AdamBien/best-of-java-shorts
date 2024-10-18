public class S16_AutoCloseable implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("closing");
    }

    public static void main(String[] args) {
        try (var a = new S16_AutoCloseable()) {
        }
    }

}
