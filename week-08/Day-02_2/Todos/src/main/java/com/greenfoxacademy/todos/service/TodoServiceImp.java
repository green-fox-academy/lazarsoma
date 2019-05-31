package com.greenfoxacademy.todos.service;

import com.greenfoxacademy.todos.model.Todo;
import com.greenfoxacademy.todos.repository.ITodoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImp implements ITodoService{

  private ITodoRepository todoRepository;

  public TodoServiceImp(ITodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todo -> todoList.add(todo));
    return todoList;
  }

  @Override
  public Todo findById(long id) {
    return todoRepository.findById(id).orElse(null);
  }

  @Override
  public void save(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void delete(long id) {
    todoRepository.deleteById(id);
  }

  @Override
  public Iterable<Todo> listTodosByTitle(String title) {
    return todoRepository.findByTitleContains(title);
  }
}

