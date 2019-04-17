
public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicatonDate;

  public BlogPost (String authorName, String title, String text, String publicatonDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicatonDate = publicatonDate;
  }

  public void printBlog1(){
      System.out.println("Blog1");
  }

  public void printBlog2(){
    System.out.println("Blog2");
  }

  public void printBlog3(){
    System.out.println("Blog3");
  }

}


