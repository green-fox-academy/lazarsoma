package com.greenfoxacademy.todos.controller;

import com.greenfoxacademy.todos.model.Todo;
import com.greenfoxacademy.todos.service.ITodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  private ITodoService iTodoService;

  public TodoController(ITodoService iTodoService) {
    this.iTodoService = iTodoService;
  }

  @GetMapping("/todo")
  public String list(Model model) {
    model.addAttribute("todos", iTodoService.findAll());
    return "todolist";
  }
}
