package kapadokia.nyandoro.Task.Scheduler.Api.repository;


import kapadokia.nyandoro.Task.Scheduler.Api.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}