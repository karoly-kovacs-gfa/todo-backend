package com.kare.todobackend.controller;

import com.kare.todobackend.dto.TodoDTO;
import com.kare.todobackend.model.Todo;
import com.kare.todobackend.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping(value = {"", "/"})
    public ResponseEntity getTodo() {
        return new ResponseEntity<>("Hello Todo", HttpStatus.ACCEPTED);
    }

    @GetMapping("/todos")
    public ResponseEntity<List<TodoDTO>> getAllTodos() {
        return new ResponseEntity<>(todoService.findAllTodos(), HttpStatus.ACCEPTED);
    }

    @PostMapping("/todos")
    public ResponseEntity<Todo> saveTodo(@RequestBody TodoDTO todo) {
        return new ResponseEntity<>(todoService.saveDTO(todo), HttpStatus.CREATED);
    }
}
