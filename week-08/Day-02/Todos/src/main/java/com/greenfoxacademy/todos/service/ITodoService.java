package com.greenfoxacademy.todos.service;

import com.greenfoxacademy.todos.model.Todo;

import java.util.List;

public interface ITodoService {

  List<Todo> findAll();
  Todo findById(long id);
  void save(Todo todo);
  void delete(long id);
}
