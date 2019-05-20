package com.greenfoxacademy.library;

public class Book {
  private static int nextID = 0;
    private int id;
  private String title;
  private String author;
  private int releaseYear;

  public Book (){

  }

  public Book( String title, String author, Integer releaseYear) {
    this.id = nextID++;
    this.title = title;
    this.author = author;
    this.releaseYear = releaseYear;
  }

  public int getId(){
    return id;
  }

  public String getTitle() {
    return title;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public String getAuthor(){
    return author;
  }

  public static void setNextID(int nextID) {
    Book.nextID = nextID;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }
}
