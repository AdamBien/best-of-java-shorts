import static java.lang.IO.*;

  
  record Runtime(int age, int weight){}
  record Dev(String name,Runtime runtime){}
  
  String dispatch(Object instance){
    return switch(instance){
      case Dev(var name, Runtime(var age, var weight)) -> name + age + weight;
      case String message -> "->" + message;
      default -> "unknown";
    };
  }

  void main() {
    var recOut = dispatch(new Dev("duke",new Runtime(20,65)));
    var stringOut = dispatch("duke");
    println(recOut);
    println(stringOut);
}