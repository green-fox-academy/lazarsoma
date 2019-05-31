package com.greenfoxacademy.todos;

import com.greenfoxacademy.todos.model.Assignee;
import com.greenfoxacademy.todos.model.Todo;
import com.greenfoxacademy.todos.repository.IAssigneeRepository;
import com.greenfoxacademy.todos.repository.ITodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosApplication implements CommandLineRunner {

  private ITodoRepository iTodoRepository;
  private IAssigneeRepository iAssigneeRepository;

  public TodosApplication(ITodoRepository iTodoRepository, IAssigneeRepository iAssigneeRepository) {
    this.iTodoRepository = iTodoRepository;
    this.iAssigneeRepository = iAssigneeRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodosApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    /*iTodoRepository.save(new Todo("Start the day"));
    iTodoRepository.save(new Todo("Finish H2 workshop1"));
    iTodoRepository.save(new Todo("Finish JPA workshop2"));
    iTodoRepository.save(new Todo("Create a CRUD project"));
    iTodoRepository.save(new Todo("Wake up"));
    iTodoRepository.save(new Todo("Go home"));

    iAssigneeRepository.save(new Assignee("John", "john.doe@gmail.com"));
    iAssigneeRepository.save(new Assignee("Jane", "jane.doe@gmail.com"));*/
  }
}
