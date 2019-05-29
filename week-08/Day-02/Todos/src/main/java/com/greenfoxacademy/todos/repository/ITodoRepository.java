package com.greenfoxacademy.todos.repository;

import com.greenfoxacademy.todos.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ITodoRepository extends CrudRepository<Todo,Long> {

  }
