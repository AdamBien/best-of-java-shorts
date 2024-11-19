import java.io.PrintStream;

interface App {
    public enum Log {
       
        ERROR(Color.RED,System.err);

        enum Color{
            RED("\033[0;41m");
            String code;
            Color(String code){
                this.code = code;
            }
        }
        String template;
        String RESET = "\u001B[0m";
        PrintStream out;        

        Log(Color color,PrintStream out) {
            this.template = (color.code + "%s" + RESET);
            this.out = out;
        }

        public void out(String message) {
            var colored = this.template.formatted(message);
            this.out.println(colored);
        }
    }

    static void main(String... args) {
        Log.ERROR.out("ex!");
    }
}