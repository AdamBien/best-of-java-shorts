import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import static java.lang.System.out;

interface S0176_NavigableMap {

  static void main(String... args) {
    NavigableMap<Integer,String> map = new TreeMap<>(
      Map.of(
        1,"XS",
        2,"S",
        4,"M")
      );

      out.println(map.get(1)); 
      out.println(map.ceilingEntry(3));   
  }
}