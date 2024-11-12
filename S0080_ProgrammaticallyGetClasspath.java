import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

interface App {

  static void main(String... args) {
    var bean = ManagementFactory
    .getPlatformMXBean(RuntimeMXBean.class);
    System.out.println("classpath: " + bean.getClassPath());
    System.out.println(System.getProperty("java.class.path"));
  }
}