package com.greenfoxacademy.todos.controller;

import com.greenfoxacademy.todos.model.Assignee;
import com.greenfoxacademy.todos.repository.IAssigneeRepository;
import com.greenfoxacademy.todos.service.IAssigneeService;
import com.greenfoxacademy.todos.service.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AssigneeController {

  @Autowired
  private IAssigneeRepository iAssigneeRepository;

  private IAssigneeService iAssigneeService;
  private ITodoService iTodoService;

  public AssigneeController(IAssigneeService iAssigneeService, ITodoService iTodoService) {
    this.iAssigneeService = iAssigneeService;
    this.iTodoService = iTodoService;
  }

  @GetMapping("/assigneelist")
  public String assigneeList(Model model) {
    model.addAttribute("assignees", iAssigneeRepository.findAll());
    return "assigneelist";
  }

  @GetMapping("/assignee/add")
  public String createAssigneeForm(Model model) {
    model.addAttribute("assignee", new Assignee());
    return "assigneeAdd";
  }

  @PostMapping("/assignee/add")
  public String createAssigneeSubmit(@ModelAttribute Assignee assignee) {
    iAssigneeService.save(assignee);
    return "redirect:/assigneelist";
  }

  @GetMapping("assignee/{id}/delete/")
  public String delete(@PathVariable long id) {
    iAssigneeRepository.deleteById(id);
    return "redirect:/assigneelist";
  }

  @GetMapping("/assignee/{id}/editAssignee")
  public String editShow(Model model, @PathVariable long id) {
    model.addAttribute("assignee", iAssigneeRepository.findById(id).get());
    return "assigneeEdit";
  }

  @PostMapping("/todo/{id}/editAssignee")
  public String editDo(@ModelAttribute Assignee assignee) {
    this.iAssigneeRepository.save(assignee);
    return "redirect:/assigneelist";
  }
}
