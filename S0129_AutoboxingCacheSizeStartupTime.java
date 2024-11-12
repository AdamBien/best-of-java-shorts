interface App {

  // time java -XX:AutoBoxCacheMax=1000000 S100_AutoboxingCacheSizeStartupTime.java
  static void main(String... args) {
    Integer.valueOf(1);
  }
}