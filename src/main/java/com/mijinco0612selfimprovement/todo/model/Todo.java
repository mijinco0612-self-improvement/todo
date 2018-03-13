package com.mijinco0612selfimprovement.todo.model;

import lombok.Data;

@Data
public class Todo {
    private int id;
    private String title;
    private String details;
    private boolean finished;

    public Todo() {
        this.title = "";
        this.details = "";
        this.finished = false;
    }

    public Todo(String title ,String details) {
        this.title = "";
        this.details = "";
        this.finished = false;
    }
}
