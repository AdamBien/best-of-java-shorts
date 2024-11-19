import java.util.prefs.Preferences;
interface App {
    static void main(String... args) throws Exception {
        var root = Preferences.userRoot();
        var air = root.node("air");
        air.put("hello", "duke");
        air.flush();
        System.out.println(air.get("ello", "-"));

    }
}