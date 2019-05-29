package com.greenfoxacademy.todos.model;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  long id;

  @Column(nullable = false)
  String title;

  @Column(nullable = false)
  boolean urgent;

  @Column(nullable = false)
  boolean done;

  @Column(updatable = false)
  @CreationTimestamp
  LocalDate created;

  public void setId(long id) {
    this.id = id;
  }

  public String getCreated() {
    return created.toString();
  }

  public void setCreated() {
    this.created =  LocalDate.now();
  }

  public Todo(String title) {
    this.title = title;
    this.done = false;
    this.urgent = false;
  }

  public Todo(String title, boolean done, boolean urgent) {
    this.title = title;
    this.done = done;
    this.urgent = urgent;
    this.created = LocalDate.now();
  }

  //------------- below this are things that are always necessary----------for internal spring reasons---------------//

  public Todo() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}
