package com.greenfoxacademy.todos.repository;

import com.greenfoxacademy.todos.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ITodoRepository extends CrudRepository<Todo,Long> {
  @Query("select todo from Todo todo where todo.done = true")
  List<Todo> allDone();

  @Query("select todo from Todo todo where todo.done = false")
  List<Todo> noneDone();

  Iterable<Todo> findByTitleContains(String title);
}
