import java.util.Base64;

interface App {

  class BytesClassLoader extends ClassLoader {

    public Class<?> findClass(String name) {
      var clazz = "yv66vgAAAEEAGwoAAgADBwAEDAAFAAYBABBqYXZhL2xhbmcvT2JqZWN0AQAGPGluaXQ+AQADKClWCQAIAAkHAAoMAAsADAEAEGphdmEvbGFuZy9TeXN0ZW0BAANvdXQBABVMamF2YS9pby9QcmludFN0cmVhbTsIAA4BAAlzdXBlcmhlcm8KABAAEQcAEgwAEwAUAQATamF2YS9pby9QcmludFN0cmVhbQEAB3ByaW50bG4BABUoTGphdmEvbGFuZy9TdHJpbmc7KVYHABYBAAREdWtlAQAEQ29kZQEAD0xpbmVOdW1iZXJUYWJsZQEAClNvdXJjZUZpbGUBAAlEdWtlLmphdmEAIQAVAAIAAAAAAAEAAQAFAAYAAQAXAAAALQACAAEAAAANKrcAAbIABxINtgAPsQAAAAEAGAAAAA4AAwAAAAIABAADAAwABAABABkAAAACABo=";
      var b = Base64.getDecoder().decode(clazz);
      return defineClass(name, b, 0, b.length);
    }
  }

  static void main(String... args) throws Exception {
    new BytesClassLoader()
        .findClass("Duke")
        .getDeclaredConstructor()
        .newInstance();
  }
}