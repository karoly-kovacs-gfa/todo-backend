package com.kare.todobackend.service;

import com.kare.todobackend.dto.TodoDTO;
import com.kare.todobackend.model.Todo;
import com.kare.todobackend.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService implements ITodoService{

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<TodoDTO> findAllTodos() {
        return todoRepository.findAll()
                .stream()
                .map(Todo::createDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Todo saveDTO(TodoDTO todoDTO) {
        return save(new Todo(todoDTO));
    }
}
