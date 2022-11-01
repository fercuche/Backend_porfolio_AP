package ar.edu.ap.portfolio.service;

import ar.edu.ap.portfolio.dto.ExperienceDto;
import ar.edu.ap.portfolio.entity.Experience;

import java.util.List;

public interface IExperienceService {

    List<Experience> getAll();
    Experience save(Experience experience);
    Experience update(Long id, ExperienceDto dto);
    void delete(Long id);
}
