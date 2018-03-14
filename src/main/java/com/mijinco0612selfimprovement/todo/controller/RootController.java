package com.mijinco0612selfimprovement.todo.controller;

import com.mijinco0612selfimprovement.todo.model.Task;
import com.mijinco0612selfimprovement.todo.service.TaskService;
import lombok.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RootController {

    @NonNull
    private final TaskService taskService;

    public RootController(TaskService taskService) {
        this.taskService = taskService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("tasks", taskService.findAll());
        model.addAttribute("task", new Task());
        return "index";
    }

    @RequestMapping(path = "/task", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute Task task) {
        taskService.register(task);
        return "redirect:/";
    }
}