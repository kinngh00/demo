package com.example.study.day7.second.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import com.example.study.day7.second.repository.TodoRepository;
import com.example.study.day7.second.entity.Todo;

@RestController
@RequestMapping("/todos")
public class TodoController {
  private final TodoRepository todoRepository;

  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @PostMapping
  public Todo createTodo(@RequestBody Todo todo) {
    return todoRepository.save(todo);
  }

  @GetMapping
  public List<Todo> getAllTodo() {
    return todoRepository.findAll();
  }

  @GetMapping("/{id}")
  public Todo getTodo(@PathVariable Long id) {
    return todoRepository.findById(id).orElseThrow();
  }

  @PutMapping("/{id}")
  public Todo putTodo(@PathVariable Long id, @RequestBody Todo updateTodo) {
    Todo todo = todoRepository.findById(id).orElseThrow();
    todo.setTask(updateTodo.getTask());
    todo.setComplete(updateTodo.isComplete());

    return todoRepository.save(todo);
  }

  @DeleteMapping("/{id}")
  public void deleteTodo(@PathVariable Long id) {
    todoRepository.deleteById(id);
  }
}
