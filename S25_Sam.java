public class S25_Sam {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("working");
        new Thread(r).start();
    }
}