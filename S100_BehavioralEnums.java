interface App {

  enum Repositories{
    BCE_DESIGN("AdamBien","bce.design");
    String repository;
    String project;
    static String URI = "https://github.com/%s/%s/%s";
    Repositories(String project,String repository){
      this.project = project;
      this.repository = repository;
    }
    public String commits(){
      return URI.formatted(this.project,this.repository,"commits");
    }


    
  }

  static void main(String... args) {
    System.out.println(Repositories.BCE_DESIGN.commits());
  }
}