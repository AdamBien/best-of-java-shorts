import java.lang.System.Logger.Level;

public class S15_BuiltInLogger {
    public static void main(String[] args) {
        var log = System.getLogger("duke");
        log.log(Level.INFO, "hello, world");
        System.out.println("adf");
    }
}