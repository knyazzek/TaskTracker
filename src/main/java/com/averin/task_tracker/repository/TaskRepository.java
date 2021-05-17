package com.averin.task_tracker.repository;

import com.averin.task_tracker.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
