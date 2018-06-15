package com.mijinco0612selfimprovement.todo.repository;

import com.mijinco0612selfimprovement.todo.model.Task;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TaskRepository {

    void register(Task task);

    List<Task> findAll();

    void deleteTask(Task task);
}



