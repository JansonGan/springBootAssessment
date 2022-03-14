package org.generation.SpringBootAssessment.service;

import org.generation.SpringBootAssessment.entity.TodoList;
import org.generation.SpringBootAssessment.repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoListServiceMySQL implements TodoListService {

private TodoListRepository todoListRepository;

public TodoListServiceMySQL(@Autowired TodoListRepository todoListRepository) {
    this.todoListRepository = todoListRepository;
}
    @Override
    public List<TodoList> all() {
        List<TodoList> result = new ArrayList<>();
        todoListRepository.findAll().forEach(result :: add);
        return result;
    }

    @Override
    public TodoList save(TodoList todoList) {
        return todoListRepository.save(todoList);
    }
}
