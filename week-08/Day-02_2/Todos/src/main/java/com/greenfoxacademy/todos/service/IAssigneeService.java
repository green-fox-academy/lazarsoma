package com.greenfoxacademy.todos.service;

import com.greenfoxacademy.todos.model.Assignee;

import java.util.List;

public interface IAssigneeService {
  List<Assignee> findAll();
  void save(Assignee assignee);
  Assignee findAssigneeById(long id);
}
