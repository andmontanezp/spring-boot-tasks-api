package com.andersonmontanez.tasks.controller;

import com.andersonmontanez.tasks.domain.Task;
import com.andersonmontanez.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> list() {
        return taskService.list();
    }

    @PostMapping(value = "/save")
    public Task saveTask(@RequestBody Task task) {
        return taskService.save(task);
    }
}
