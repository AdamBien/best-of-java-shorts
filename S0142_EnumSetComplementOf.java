import java.util.EnumSet;
import static java.lang.System.out;

interface App {

  enum Languages {
    JAVA, JAVASCRIPT, C;
  }

  public static void main(String[] args) {
    var boring = EnumSet
    .of(Languages.JAVASCRIPT, Languages.C);
    var exciting = EnumSet.complementOf(boring);

    out.println("boring: " + boring);
    out.println("exciting: " + exciting);
  }
}
