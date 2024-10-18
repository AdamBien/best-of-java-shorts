import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

interface App {

  static void main(String... args) throws IOException {
    var uri = URI
    .create("https://airhacks.live");
    Desktop.getDesktop().browse(uri);
  }
}