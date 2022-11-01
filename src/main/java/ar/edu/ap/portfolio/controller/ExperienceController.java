package ar.edu.ap.portfolio.controller;

import ar.edu.ap.portfolio.dto.ExperienceDto;
import ar.edu.ap.portfolio.entity.Experience;
import ar.edu.ap.portfolio.service.IExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiences")
public class ExperienceController {

    @Autowired
    private IExperienceService experienceService;

    @GetMapping("/all")
    public ResponseEntity<List<Experience>> getAll(){
        List<Experience> experiences= experienceService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(experiences);
    }

    @PostMapping
    public ResponseEntity<Experience> saveExp(@RequestBody Experience exp){
        Experience experience = experienceService.save(exp);
        return ResponseEntity.status(HttpStatus.CREATED).body(experience);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Experience> updateExp(@PathVariable Long id, @RequestBody ExperienceDto dto){
        Experience updated = experienceService.update(id, dto);
        return ResponseEntity.status(HttpStatus.OK).body(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExp(@PathVariable Long id){
        experienceService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
