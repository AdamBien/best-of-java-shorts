import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class S0009_ReadFromClipboard {

    public static void main(String[] args) throws UnsupportedFlavorException, IOException {
        var cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        var content = cb.getData(DataFlavor.stringFlavor);
        System.out.println(content);
    }
}