package ar.edu.ap.portfolio.service;

import ar.edu.ap.portfolio.entity.Language;

import java.util.List;

public interface LanguageService {

    List<Language> getAll();
    Language getById(Long id);
    Language save(Language language);
    Language update(Long id, Language language);
    void delete(Long id);
}
