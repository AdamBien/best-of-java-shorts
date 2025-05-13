import java.util.HashMap;

interface S162_MapMerge {

  static String map(String o,String n){
    System.out.println(o + ":" + n);
    return o + "->" + n;
  }

  static void main(String... args) {
    var map = new HashMap<String,String>();
    map.put("hello","world");
    map.merge("hello","duke",S162_MapMerge::map);
    System.out.println(map);
  }
}