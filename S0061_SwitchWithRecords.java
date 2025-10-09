import static java.lang.IO.println;
interface App {
  
  record Dev(String name,int age){}
  
  static String dispatch(Object instance){
    return switch(instance){
      case Dev(var name, var age) -> name + age;
      case String message -> "->" + message;
      default -> "unknown";
    };
  }

  static void main(String... args) {
    var recordOut = dispatch(new Dev("duke",12));
    var stringOut = dispatch("duke");
    println(recordOut);
    println(stringOut);
    
  }
}