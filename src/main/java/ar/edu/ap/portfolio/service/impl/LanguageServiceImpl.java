package ar.edu.ap.portfolio.service.impl;

import ar.edu.ap.portfolio.dto.LanguageDto;
import ar.edu.ap.portfolio.entity.Language;
import ar.edu.ap.portfolio.exception.ParamNotFound;
import ar.edu.ap.portfolio.mapper.LanguageMapper;
import ar.edu.ap.portfolio.repository.LanguageRepository;
import ar.edu.ap.portfolio.service.ILanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageServiceImpl implements ILanguageService {

    @Autowired
    private LanguageRepository repository;

    @Autowired
    private LanguageMapper mapper;

    public List<Language> getAll() {
        List<Language> languages = repository.findAll();
        if (languages.isEmpty()){
            throw new ParamNotFound("No se encontraron idiomas");
        }
        return languages;
    }

    public Language save(Language language) {
        return repository.save(language);
    }

    public Language update(Long id, LanguageDto dto) {
        Optional<Language> response = repository.findById(id);
        if (!response.isPresent()) {
            throw new ParamNotFound("El id" + id + "no se encuentra");
        }
            Language language = response.get();
            Language updateLang = mapper.updateLanguageFromLanguageDto(dto, language);
            return repository.save(updateLang);
    }

    public void delete(Long id) {
        Optional<Language> language = repository.findById(id);
        if (!language.isPresent()) {
            throw new ParamNotFound("No se encuentra el id " + id);
        }
        repository.deleteById(id);
    }
}
