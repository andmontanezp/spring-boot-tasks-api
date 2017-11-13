package com.andersonmontanez.tasks.service;

import com.andersonmontanez.tasks.domain.Task;

public interface TaskService {
    Iterable<Task> list();

    Task save(Task task);
}
