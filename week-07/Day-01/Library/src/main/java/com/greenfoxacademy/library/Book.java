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
}
