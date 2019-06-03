package com.greenfoxacademy.todos.controller;

import com.greenfoxacademy.todos.model.Todo;
import com.greenfoxacademy.todos.repository.ITodoRepository;
import com.greenfoxacademy.todos.service.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

  @Autowired
  ITodoRepository iTodoRepository;

  private ITodoService iTodoService;


  public TodoController(ITodoService iTodoService) {
    this.iTodoService = iTodoService;
  }

  @GetMapping("/todolist")
  public String list(Model model) {
    model.addAttribute("todos", iTodoService.findAll());
    return "todolist";
  }

  @GetMapping("/todo")
  public String list(Model model, @RequestParam(required = false) boolean isActive) {
    if (isActive) {
      model.addAttribute("todos", iTodoRepository.noneDone());
    } else {
      model.addAttribute("todos", iTodoRepository.allDone());
    }
    return "todolist";
  }

  @GetMapping("/todo/add")
  public String createTodoForm(Model model) {
    model.addAttribute("todo", new Todo());
    return "add";
  }

  @PostMapping("/todo/add")
  public String createTodoSubmit(@ModelAttribute Todo todo) {
    iTodoService.save(todo);
    return "redirect:/todolist";
  }

  @GetMapping("/todo/{id}/delete")
  public String delete(@PathVariable long id) {
    iTodoRepository.deleteById(id);
    return "redirect:/todolist";
  }

  @GetMapping("/todo/{id}/edit")
  public String editShow(Model model, @PathVariable long id) {
    model.addAttribute("todo", iTodoRepository.findById(id).get());
    return "edit";
  }

  @PostMapping("/todo/{id}/edit")
  public String editDo(@ModelAttribute Todo todo) {
    this.iTodoRepository.save(todo);
    return "redirect:/todolist";
  }

  @GetMapping("/todolist/search")
  public String showTodosByTitle(@RequestParam(value = "search", required = false) String title, Model model) {
    model.addAttribute("search", iTodoService.listTodosByTitle(title));
    return "todolistSearched";
  }

  /*@GetMapping("/todolist/addAssignee")
  public String addASsignee()*/
}
