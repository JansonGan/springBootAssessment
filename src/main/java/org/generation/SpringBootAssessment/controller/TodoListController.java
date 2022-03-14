package org.generation.SpringBootAssessment.controller;

import org.generation.SpringBootAssessment.entity.TodoList;
import org.generation.SpringBootAssessment.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todolist")
public class TodoListController {

    private final TodoListService todoListService;

    public TodoListController(@Autowired TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @CrossOrigin
    @GetMapping("/alllist")
    public Iterable<TodoList> getList() {
        return this.todoListService.all();
    }

    @CrossOrigin
    @PostMapping("/add")
    public TodoList addTodo(TodoList todoList) {
    return todoListService.save(todoList);
    }
}
