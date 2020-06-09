package kapadokia.nyandoro.Task.Scheduler.Api.repository;

import kapadokia.nyandoro.Task.Scheduler.Api.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}