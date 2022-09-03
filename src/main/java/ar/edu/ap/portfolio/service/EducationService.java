package ar.edu.ap.portfolio.service;

import ar.edu.ap.portfolio.entity.Education;

import java.util.List;

public interface EducationService {

    List<Education> getAll();
    Education getById(Long id);
    Education save(Education education);
    Education update(Long id, Education education);
    void delete(Long id);
}
