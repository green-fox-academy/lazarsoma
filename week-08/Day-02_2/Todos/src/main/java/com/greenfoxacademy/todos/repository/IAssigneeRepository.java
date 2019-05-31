package com.greenfoxacademy.todos.repository;

import com.greenfoxacademy.todos.model.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface IAssigneeRepository extends CrudRepository<Assignee, Long> {

}
