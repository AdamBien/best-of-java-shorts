import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * App
 */
public class S40_SoutRedirect {

    public static void main(String[] args) throws FileNotFoundException {
        var s = new PrintStream("log.file");
        System.setOut(s);
        System.out.println("hello,duke");
    }
}