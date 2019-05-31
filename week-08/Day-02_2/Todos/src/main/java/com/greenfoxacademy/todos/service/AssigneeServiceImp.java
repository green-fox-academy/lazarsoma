package com.greenfoxacademy.todos.service;

import com.greenfoxacademy.todos.model.Assignee;
import com.greenfoxacademy.todos.model.Todo;
import com.greenfoxacademy.todos.repository.IAssigneeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeServiceImp implements IAssigneeService {

  private IAssigneeRepository iAssigneeRepository;

  public AssigneeServiceImp(IAssigneeRepository iAssigneeRepository) {
    this.iAssigneeRepository = iAssigneeRepository;
  }

  @Override
  public List<Assignee> findAll() {
    List<Assignee> assigneeList = new ArrayList<>();
    iAssigneeRepository.findAll().forEach(assignee -> assigneeList.add(assignee));
    return assigneeList;
  }

  @Override
  public void save(Assignee assignee) {
    iAssigneeRepository.save(assignee);
  }

  @Override
  public Assignee findAssigneeById(long id) {
    return iAssigneeRepository.findById(id).orElse(null);
  }
}
