package com.mijinco0612selfimprovement.todo.service;

import com.mijinco0612selfimprovement.todo.model.Task;
import com.mijinco0612selfimprovement.todo.repository.TaskRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @NonNull
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll(){
       return taskRepository.findAll();
    }

    public void register(Task task){
        taskRepository.register(task);
    }

    public void deleteTask(Task task){
        taskRepository.deleteTask(task);
    }
}
