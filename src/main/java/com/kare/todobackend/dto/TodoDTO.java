package com.kare.todobackend.dto;

public class TodoDTO {
    private String name;

    public TodoDTO(String name) {
        this.name = name;
    }

    public TodoDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
