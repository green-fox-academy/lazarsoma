public class Main {
  public static void main(String[] args){
    Blog newBlog = new Blog();

    newBlog.add("John", "Title1", "Text1", "Today");
    newBlog.add("Jane", "Title2", "Text2", "Tomorrow");
    newBlog.add("Chris", "Title3", "Text3", "Yesterday");
    newBlog.add("Adam", "Title4", "Text4", "Wednesday");
    newBlog.add("Mike", "Title5", "Text5", "Friday");

    System.out.println(newBlog.blogPosts.get(2).text);
    newBlog.delete(0);
    System.out.println(newBlog.blogPosts.size());
    newBlog.update(1);
    System.out.println(newBlog.blogPosts.get(1).text);
  }
}