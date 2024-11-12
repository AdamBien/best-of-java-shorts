public class S0011_ReadPassword {

    public static void main(String[] args) {
        var console = System.console();
        var chars = console.readPassword("pwd>");
        System.out.println(chars);
    }

}