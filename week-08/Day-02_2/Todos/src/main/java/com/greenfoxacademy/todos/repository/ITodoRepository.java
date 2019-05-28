package com.greenfoxacademy.todos.repository;

import com.greenfoxacademy.todos.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface ITodoRepository extends CrudRepository<Todo,Long> {
}
