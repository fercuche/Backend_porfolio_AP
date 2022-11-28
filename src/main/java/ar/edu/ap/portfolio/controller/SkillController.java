package ar.edu.ap.portfolio.controller;

import ar.edu.ap.portfolio.dto.SkillDto;
import ar.edu.ap.portfolio.entity.Skill;
import ar.edu.ap.portfolio.service.ISkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","https://portfolioap-184a7.web.app"})
@RequestMapping("/skills")
public class SkillController {

    @Autowired
    private ISkillService service;

    @GetMapping
    public ResponseEntity<List<Skill>> getAll(){
        List<Skill> skills = service.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(skills);
    }

    @PostMapping
    public ResponseEntity<Skill> save(@RequestBody Skill skill){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(skill));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Skill> update(@PathVariable Long id, @RequestBody SkillDto dto){
        Skill updated = service.update(id, dto);
        return ResponseEntity.status(HttpStatus.OK).body(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
