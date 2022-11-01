package ar.edu.ap.portfolio.service;

import ar.edu.ap.portfolio.dto.LanguageDto;
import ar.edu.ap.portfolio.entity.Language;

import java.util.List;

public interface ILanguageService {

    List<Language> getAll();
    Language save(Language language);
    Language update(Long id, LanguageDto dto);
    void delete(Long id);
}
