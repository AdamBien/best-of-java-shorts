import java.lang.management.ManagementFactory;
import com.sun.management.UnixOperatingSystemMXBean;


interface S159_InstanceOfOpenFD {

  static void main(String... args) {
    var osb =  ManagementFactory
    .getOperatingSystemMXBean();
    if(osb instanceof UnixOperatingSystemMXBean ux){
      var open = ux.getOpenFileDescriptorCount();
      var max = ux.getMaxFileDescriptorCount();
      System.out.println(open);
      System.out.println(max);
  
    }
  }
}