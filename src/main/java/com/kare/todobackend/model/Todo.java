package com.kare.todobackend.model;

import com.kare.todobackend.dto.TodoDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Todo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Todo() {
    }

    public Todo(TodoDTO todoDTO) {
        this(null, todoDTO.getName());
    }

    public TodoDTO createDTO() {
        return new TodoDTO(name);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
