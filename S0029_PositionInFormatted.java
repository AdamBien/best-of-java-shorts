public class S0029_PositionInFormatted {

    public static void main(String[] args) {
        var message = """
                hello, %1$s
                question: %2$s
                good bye, %1$s
                """.formatted("duke", "are you developer?");
        System.out.println(message);
    }
}