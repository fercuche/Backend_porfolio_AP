package ar.edu.ap.portfolio.service.impl;

import ar.edu.ap.portfolio.dto.ExperienceDto;
import ar.edu.ap.portfolio.entity.Experience;
import ar.edu.ap.portfolio.exception.ParamNotFound;
import ar.edu.ap.portfolio.mapper.ExperienceMapper;
import ar.edu.ap.portfolio.repository.ExperienceRepository;
import ar.edu.ap.portfolio.service.IExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceServiceImpl implements IExperienceService {

    @Autowired
    private ExperienceRepository repository;

    @Autowired
    private ExperienceMapper mapper;

    public List<Experience> getAll() {
        List<Experience> experiences = repository.findAll();
        if(experiences.isEmpty()){
            throw new ParamNotFound("No se encuentran los atributos requeridos");
        }
        return experiences;
    }

    public Experience save(Experience experience) {
        return repository.save(experience);
    }

    public Experience update(Long id, ExperienceDto dto) {
        Optional<Experience> response = repository.findById(id);
        if (!response.isPresent()){
            throw new ParamNotFound("No se encuentra el id" + id);
        }
        Experience exp = response.get();
        Experience updatedExp = mapper.updateExperienceFromExperienceDto(dto,exp);
        return repository.save(updatedExp);
    }

    public void delete(Long id) {
        Optional<Experience> response = repository.findById(id);
        if (!response.isPresent()){
            throw new ParamNotFound("No se encuentra el id" + id);
        }
        repository.deleteById(id);
    }
}
