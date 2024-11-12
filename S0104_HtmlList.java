import java.util.stream.Collectors;
import java.util.stream.Stream;

interface App {

  static void main(String... args) {
    var html = Stream
    .of("write","compile","test","delete")
    .map("<li>%s</li>"::formatted)
    .collect(Collectors.joining("\n","<ol>\n","\n</ol>"));
    System.out.println(html);
  }
}