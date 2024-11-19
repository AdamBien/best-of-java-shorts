import java.util.stream.Stream;

public class S0052_RecordInAClass {

    public static void main(String[] args) {
        record Flag(String flag) {
            boolean isOnline() {
                return "mode=online".equalsIgnoreCase(this.flag);
            }
        }
        var online = Stream.of(args)
                .map(Flag::new)
                .filter(Flag::isOnline)
                .findAny()
                .isPresent();
        System.out.println(online);

    }

}