
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
  public void printAuthorname(){
      System.out.println(this.authorName);
  }
  public void printPublicationDate(){
    System.out.println(this.publicatonDate);
  }
  public void printText(){
    System.out.println(this.text);
  }
  public void printTite() {
    System.out.println(this.title);
  }

}


