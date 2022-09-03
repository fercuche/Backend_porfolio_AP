package ar.edu.ap.portfolio.repository;

import ar.edu.ap.portfolio.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education, Long> {
}