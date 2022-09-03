package ar.edu.ap.portfolio.service;

import ar.edu.ap.portfolio.entity.Project;

import java.util.List;

public interface ProjectService {

    List<Project> getAll();
    Project getById(Long id);
    Project save(Project project);
    Project update(Long id, Project project);
    void delete(Long id);
}
