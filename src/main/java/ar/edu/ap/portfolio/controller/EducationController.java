package ar.edu.ap.portfolio.controller;

import ar.edu.ap.portfolio.dto.EducationDto;
import ar.edu.ap.portfolio.entity.Education;
import ar.edu.ap.portfolio.service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = {"http://localhost:4200","https://portfolioap-184a7.web.app"})
@RequestMapping("/education")
public class EducationController {

    @Autowired
    private IEducationService educationService;

    @GetMapping
    public ResponseEntity<List<Education>> getAll(){
        List<Education> educationList = educationService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(educationList);
    }

    @PostMapping
    public ResponseEntity<Education> save(@RequestBody Education education){
        Education response = educationService.save(education);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Education> update(@PathVariable Long id, @RequestBody EducationDto dto){
        Education updated = educationService.update(id, dto);
        return ResponseEntity.status(HttpStatus.OK).body(updated);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        educationService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}