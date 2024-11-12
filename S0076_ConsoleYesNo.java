import java.io.Console;

interface App {

    static boolean yes() {
        return System.console()
        .readLine("?")
        .equalsIgnoreCase("y");
    }

    public static void main(String[] args) {
        if (!yes())
            return;
        System.out.println("confirmed only");
    }

}