package com.averin.task_tracker.service;

import com.averin.task_tracker.domain.Task;
import com.averin.task_tracker.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Iterable<Task> findAll() {
        return taskRepository.findAll();
    }
}
