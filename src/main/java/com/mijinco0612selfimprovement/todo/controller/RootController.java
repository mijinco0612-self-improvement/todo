package com.mijinco0612selfimprovement.todo.controller;

import com.mijinco0612selfimprovement.todo.model.Todo;
import com.mijinco0612selfimprovement.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
public class RootController {
    @Autowired
    TodoRepository todoRepository;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    @Transactional
    public String index(Model model) {
        Iterable<Todo> todos = todoRepository.findAll();
        model.addAttribute("now", new Date().toString());
        model.addAttribute("todos", todos);
        return "index";
    }

    @RequestMapping(path = "/todo", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute Todo todo) {
        System.out.println(todo.getTitle());
        return "redirect:/";
    }

    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    @Transactional
    public ResponseEntity<String> todos() {
        Iterable<Todo> Todos = todoRepository.findAll();
        String result = StreamSupport.stream(Todos.spliterator(), false).map(Object:: toString).collect(Collectors.joining(","));
        return ResponseEntity.ok(result);
    }
}