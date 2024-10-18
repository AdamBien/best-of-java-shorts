interface App {
  
  record Dev(String name,int age){}
  
  static void dispatch(Object instance){
    switch(instance){
      case Dev(var name, var age) -> System.out.println(name + age);
      case String message -> System.out.println("->" + message);
      default -> System.out.println("unknown");
    }
  }

  static void main(String... args) {
    dispatch(new Dev("duke",12));
    dispatch("duke");
    
  }
}