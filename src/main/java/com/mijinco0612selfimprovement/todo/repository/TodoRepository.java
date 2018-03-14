package com.mijinco0612selfimprovement.todo.repository;

import com.mijinco0612selfimprovement.todo.model.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TodoRepository {

    void register(Todo todo);

    Todo select(int id);

    List<Todo> findAll();
}



