package ar.edu.ap.portfolio.repository;

import ar.edu.ap.portfolio.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}