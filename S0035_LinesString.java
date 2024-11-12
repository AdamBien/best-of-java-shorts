public class S0035_LinesString {

    public static void main(String[] args) {
        var result = """
                duke is nice
                java rocks
                james likes duke
                """
                .lines()
                .filter(l -> l.contains("java"))
                .findAny()
                .orElse("not found");

        System.out.println(result);
    }
}
