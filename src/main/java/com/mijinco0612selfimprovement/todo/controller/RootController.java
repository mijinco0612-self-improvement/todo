package com.mijinco0612selfimprovement.todo.controller;

import com.mijinco0612selfimprovement.todo.model.Todo;
import com.mijinco0612selfimprovement.todo.service.TodoService;
import lombok.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RootController {

    @NonNull
    private final TodoService todoService;

    public RootController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("todos",todoService.findAll());
        model.addAttribute("todo", new Todo());
        return "index";
    }

    @RequestMapping(path = "/todo", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute Todo todo) {
        todoService.register(todo);
        return "redirect:/";
    }
}