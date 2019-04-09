public class UrlFixer {
  public static void main(String... args){
  String url = "https//www.reddit.com/r/nevertellmethebots";;
  System.out.println(url.replace("bots" , "odds"));
  System.out.println(url.replaceFirst("/" , ":/"));
  }
}


