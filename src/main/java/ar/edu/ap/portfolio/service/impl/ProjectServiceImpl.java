package ar.edu.ap.portfolio.service.impl;

import ar.edu.ap.portfolio.dto.ProjectDto;
import ar.edu.ap.portfolio.entity.Project;
import ar.edu.ap.portfolio.exception.ParamNotFound;
import ar.edu.ap.portfolio.mapper.ProjectMapper;
import ar.edu.ap.portfolio.repository.ProjectRepository;
import ar.edu.ap.portfolio.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements IProjectService {

    @Autowired
    private ProjectRepository repository;

    @Autowired
    private ProjectMapper mapper;


    public List<Project> getAll() {
        List<Project> projects = repository.findAll();
        if (projects.isEmpty()){
            throw new ParamNotFound("No existen proyectos");
        }
        return projects;
    }

    public Project save(Project project) {
        return repository.save(project);
    }

    public Project update(Long id, ProjectDto dto) {
        Optional<Project> response = repository.findById(id);
        if (!response.isPresent()) {
            throw new ParamNotFound("El id" + id + "no se encuentra");
        }
        Project project = response.get();
        Project updateProject = mapper.updateProjectFromProjectDto(dto,project);
        return repository.save(updateProject);
    }

    public void delete(Long id) {
        Optional<Project> project = repository.findById(id);
        if (!project.isPresent()) {
            throw new ParamNotFound("No se encuentra el id " + id);
        }
        repository.deleteById(id);
    }
}
