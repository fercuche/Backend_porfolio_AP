package ar.edu.ap.portfolio.repository;

import ar.edu.ap.portfolio.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Long> {
}