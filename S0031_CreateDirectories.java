import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class S0031_CreateDirectories {

    public static void main(String[] args) throws IOException {
        var path = Path.of("hello/duke/rocks");
        Files.createDirectories(path);
    }
}