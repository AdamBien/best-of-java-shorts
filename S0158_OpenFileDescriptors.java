import java.lang.management.ManagementFactory;
import com.sun.management.UnixOperatingSystemMXBean;


interface S158_OpenFileDescriptors {

  static void main(String... args) {
    var osb =  ManagementFactory
    .getOperatingSystemMXBean();
    var ux = (UnixOperatingSystemMXBean)osb;
    var open = ux.getOpenFileDescriptorCount();
    var max = ux.getMaxFileDescriptorCount();
    System.out.println(open);
    System.out.println(max);
  }
}