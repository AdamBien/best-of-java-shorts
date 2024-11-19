public class S0025_Sam {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("working");
        new Thread(r).start();
    }
}