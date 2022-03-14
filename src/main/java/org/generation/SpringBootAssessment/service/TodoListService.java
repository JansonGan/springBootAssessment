package org.generation.SpringBootAssessment.service;

import org.generation.SpringBootAssessment.entity.TodoList;

import java.util.List;

public interface TodoListService {

    List<TodoList> all();

    TodoList save(TodoList todoList);
}
