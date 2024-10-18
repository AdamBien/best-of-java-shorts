import java.util.stream.Stream;

public class S55_FlatMap {

    static Stream<String> addPrefix(String prefix) {
        return Stream
                .of("java", "duke")
                .map(s -> prefix + " " + s);
    }

    public static void main(String[] args) {
        var messages = Stream
                .of("hey", "hi")
                .flatMap(S55_FlatMap::addPrefix)
                .toList();
        System.out.println(messages);

    }

}