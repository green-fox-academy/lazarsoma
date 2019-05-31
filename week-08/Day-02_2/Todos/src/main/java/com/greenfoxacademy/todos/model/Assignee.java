package com.greenfoxacademy.todos.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(nullable = false)
  String name;
  @Column(nullable = false)
  String email;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "assignee")
  private List<Todo> todos;

  public Assignee() {

  }

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }
}
