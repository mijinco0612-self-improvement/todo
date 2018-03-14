package com.mijinco0612selfimprovement.todo.model;

import lombok.Data;

@Data
public class Task {
    private int id;
    private String title;
    private String details;
    private boolean finished;

    public Task() {
        this.title = "";
        this.details = "";
        this.finished = false;
    }

    public Task(String title , String details) {
        this.title = "";
        this.details = "";
        this.finished = false;
    }
}
