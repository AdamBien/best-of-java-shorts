import java.util.stream.Collectors;
import java.util.stream.Stream;

public class S38_StreamArraytoStream {

    public static void main(String[] args) {
        var stringArgs = Stream
        .of(args)
        .map(String::toUpperCase)
        .collect(Collectors.joining(","));
        System.out.println(stringArgs);
    }
}