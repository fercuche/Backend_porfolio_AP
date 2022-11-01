package ar.edu.ap.portfolio.service;

import ar.edu.ap.portfolio.dto.EducationDto;
import ar.edu.ap.portfolio.entity.Education;

import java.util.List;

public interface IEducationService {

    List<Education> getAll();
    Education save(Education education);
    Education update(Long id, EducationDto dto);
    void delete(Long id);
}
