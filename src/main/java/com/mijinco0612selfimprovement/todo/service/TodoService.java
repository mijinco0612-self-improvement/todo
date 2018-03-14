package com.mijinco0612selfimprovement.todo.service;

import com.mijinco0612selfimprovement.todo.model.Todo;
import com.mijinco0612selfimprovement.todo.repository.TodoRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @NonNull
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findAll(){
        List<Todo> todos = todoRepository.findAll();
        return todos;
    }

    public void register(Todo todo){
        System.out.println(todo);
        todoRepository.register(todo);
    }
}
