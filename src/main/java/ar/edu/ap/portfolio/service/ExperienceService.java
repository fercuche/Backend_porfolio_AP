package ar.edu.ap.portfolio.service;

import ar.edu.ap.portfolio.entity.Education;
import ar.edu.ap.portfolio.entity.Experience;

import java.util.List;

public interface ExperienceService {

    List<Experience> getAll();
    Experience getById(Long id);
    Experience save(Education education);
    Experience update(Long id, Experience experience);
    void delete(Long id);
}
