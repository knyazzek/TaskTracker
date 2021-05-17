package com.averin.task_tracker.controller;

import com.averin.task_tracker.domain.Task;
import com.averin.task_tracker.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WSController {
    private final TaskService taskService;

    @Autowired
    public WSController(TaskService taskService) {
        this.taskService = taskService;
    }

    @MessageMapping("/task")
    @SendTo("/topic/tasks")
    public Task sendTask(Task task) throws Exception {
        return task;
    }
}
