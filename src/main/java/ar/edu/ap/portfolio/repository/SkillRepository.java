package ar.edu.ap.portfolio.repository;

import ar.edu.ap.portfolio.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}