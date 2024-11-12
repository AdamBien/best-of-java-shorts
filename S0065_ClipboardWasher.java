
import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;

interface App {

  static String readClipboard()
      throws Exception {
    var cb = Toolkit.getDefaultToolkit().getSystemClipboard();
    return (String) cb.getData(DataFlavor.stringFlavor);
  }

  static void writeClipboard(String content) {
    var cb = Toolkit.getDefaultToolkit()
        .getSystemClipboard();
    cb.setContents(new Transferable() {
      @Override
      public DataFlavor[] getTransferDataFlavors() {
        return new DataFlavor[] { 
          DataFlavor.stringFlavor 
        };
      }

      @Override
      public boolean isDataFlavorSupported(DataFlavor flavor) {
        return true;
      }

      @Override
      public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
        return content;
      }

    }, (c, t) -> {
    });

  }

  static void main(String... args)
      throws Exception {
    var content = readClipboard();
    writeClipboard(content);
  }
}
