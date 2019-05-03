import java.util.ArrayList;
import java.util.List;

public class Blog {

  List <BlogPost> blogPosts = new ArrayList<>();

  public void add(String authorName, String text, String title, String publicationDate){
    blogPosts.add(new BlogPost(authorName,text,title,publicationDate));
  }

  public void delete(int i){
    blogPosts.remove(i);
  }

  public void update(int i){
    blogPosts.set(i, new BlogPost("newJohn", "newTitle1", "newText1", "newToday"));
  }
}