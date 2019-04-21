public class Blogs {
  public static void main(String[] args) {
    BlogPost Blog1;
    Blog1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
    Blog1.printAuthorname();
    Blog1.printPublicationDate();
    Blog1.printText();
    Blog1.printTite();

    BlogPost Blog2;
    Blog2 = new BlogPost( "Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
    Blog2.printAuthorname();
    Blog2.printPublicationDate();
    Blog2.printText();
    Blog2.printTite();

    BlogPost Blog3;
    Blog3 = new BlogPost( "William Turton", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "Lorem ipsum dolor sit amet.", "2017.03.28.");
    Blog3.printAuthorname();
    Blog3.printPublicationDate();
    Blog3.printText();
    Blog3.printTite();
  }
}
