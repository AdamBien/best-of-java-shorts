import static java.lang.System.*;

interface App {
  
  record Runtime(int age, int weight){}
  record Dev(String name,Runtime runtime){}
  
  static void dispatch(Object instance){
    switch(instance){
      case Dev(var name, Runtime(var age, var weight)) -> out.println(name + age + weight);
      case String message -> System.out.println("->" + message);
      default -> System.out.println("unknown");
    }
  }

  static void main(String... args) {
    dispatch(new Dev("duke",new Runtime(20,65)));
    dispatch("duke");
    
  }
}