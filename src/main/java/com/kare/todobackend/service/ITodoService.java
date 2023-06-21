package com.kare.todobackend.service;

import com.kare.todobackend.dto.TodoDTO;
import com.kare.todobackend.model.Todo;

import java.util.List;

public interface ITodoService {

    public List<TodoDTO> findAllTodos();
    public Todo save(Todo todo);
    public Todo saveDTO(TodoDTO todoDTO);
}
