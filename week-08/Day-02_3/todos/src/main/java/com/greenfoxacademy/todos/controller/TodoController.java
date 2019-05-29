package com.greenfoxacademy.todos.controller;


import com.greenfoxacademy.todos.model.Todo;
import com.greenfoxacademy.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todorepository;

  @GetMapping("")
  public String listShow(Model model) {
    model.addAttribute("todos", todorepository.findAll());

    return "todolist";
  }

  @PutMapping("")
  public String listDo(Model model, @RequestParam boolean isActive) {
    if (isActive) {
      model.addAttribute("todos", todorepository.noneDone());
    } else {
      model.addAttribute("todos", todorepository.allDone());
    }
    return "todolist";
  }

  @GetMapping("/add")
  public String addShow(Model model) {
    model.addAttribute("todo", new Todo());
    return "add";
  }

  @PostMapping("/add")
  public String addDo(@ModelAttribute Todo todo) {
    this.todorepository.save(todo);

    return "redirect:/todo";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable long id) {
    this.todorepository.deleteById(id);
    return "redirect:/todo";
  }

  @GetMapping("/{id}/edit")
  public String editShow(Model model, @PathVariable long id) {
    model.addAttribute("todo", this.todorepository.findById(id).get());
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String editDo(@ModelAttribute Todo todo) {
    this.todorepository.save(todo);
    return "redirect:/todo";
  }

  @GetMapping("/{id}")
  public String showOne(Model model, @PathVariable long id) {
    model.addAttribute("todos", Arrays.asList(this.todorepository.findById(id).get()));
    return "todolist";
  }
}
