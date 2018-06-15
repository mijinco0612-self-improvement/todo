package com.mijinco0612selfimprovement.todo.model;

import lombok.Data;

@Data
public class Task {
    private int id;
    private String title;
    private boolean finished;

    public Task() {
        this.title = "";
        this.finished = false;
    }

    public Task(String title , String details) {
        this.title = "";
        this.finished = false;
    }
}
