package ar.edu.ap.portfolio.service;

import ar.edu.ap.portfolio.dto.ProjectDto;
import ar.edu.ap.portfolio.entity.Project;

import java.util.List;

public interface IProjectService {

    List<Project> getAll();
    Project save(Project project);
    Project update(Long id, ProjectDto dto);
    void delete(Long id);
}
