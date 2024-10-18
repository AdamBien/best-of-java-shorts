import static java.lang.System.*;
import java.beans.EventHandler;

public class S60_MagicalBeanEventHandler {

  public void notifyDuke() {
    out.println("run was called");
  }

  public static void main(String... args) {
    var app = new S60_MagicalBeanEventHandler();
    var runnable = EventHandler.create(Runnable.class, app,"notifyDuke");       
    runnable.run();
  }
}