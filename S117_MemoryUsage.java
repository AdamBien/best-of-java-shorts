import static java.lang.System.out;

interface App {

  static long asMb(long bytes){
    return bytes / 1024 / 1024;
  }

  static void main(String... args) {
    var runtime = Runtime.getRuntime();
    var total = asMb(runtime.totalMemory());
    var free = asMb(runtime.freeMemory());
    var usedMemory = total - free;
    out.println("usage: %dMB".formatted(usedMemory));
    out.println("total: %dMB".formatted(total));
    out.println("free: %dMB".formatted(free));
  }
}