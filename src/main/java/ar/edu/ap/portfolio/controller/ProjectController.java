package ar.edu.ap.portfolio.controller;

import ar.edu.ap.portfolio.dto.ProjectDto;
import ar.edu.ap.portfolio.entity.Project;
import ar.edu.ap.portfolio.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","https://portfolioap-184a7.web.app"})
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private IProjectService service;

    @GetMapping
    public ResponseEntity<List<Project>> getAll(){
        List<Project> projects = service.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(projects);
    }

    @PostMapping
    public ResponseEntity<Project> saveProject(@RequestBody Project project){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(project));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Project> updateProject(@PathVariable Long id, @RequestBody ProjectDto dto){
        Project updated = service.update(id, dto);
        return ResponseEntity.status(HttpStatus.OK).body(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
