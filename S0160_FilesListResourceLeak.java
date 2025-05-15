import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.nio.file.Files;
import java.nio.file.Path;

import com.sun.management.UnixOperatingSystemMXBean;

interface S160_FilesListResourceLeak {

  static void openFD() {
    var osb = ManagementFactory
        .getOperatingSystemMXBean();
    if (osb instanceof UnixOperatingSystemMXBean ux) {
      var openFDCount = ux.getOpenFileDescriptorCount();
      System.out.println("fd count: " + openFDCount);
    }
  }

  static String read(Path path) {
    try {
      return Files.readString(path);
    } catch (IOException e) {
      throw new IllegalStateException();
    }
  }

  static void main(String... args) throws IOException {
    var dir = Path.of(".");
    openFD();

    try (var directoryStream = Files.list(dir)) {
      var fileCount = directoryStream.map(S160_FilesListResourceLeak::read)
          .count();
      System.out.println(fileCount);

    }
    openFD();

  }
}