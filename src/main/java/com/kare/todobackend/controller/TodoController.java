package com.kare.todobackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping(value = {"", "/"})
    public ResponseEntity getTodo() {
        return new ResponseEntity<>("Hello Todo", HttpStatus.ACCEPTED);
    }
}
