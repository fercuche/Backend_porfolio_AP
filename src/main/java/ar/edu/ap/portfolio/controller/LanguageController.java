package ar.edu.ap.portfolio.controller;

import ar.edu.ap.portfolio.dto.LanguageDto;
import ar.edu.ap.portfolio.entity.Language;
import ar.edu.ap.portfolio.service.ILanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/languages")
public class LanguageController {

    @Autowired
    private ILanguageService service;

    @GetMapping
    public ResponseEntity<List<Language>> getAll(){
        List<Language> languages = service.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(languages);
    }

    @PostMapping
    public ResponseEntity<Language> saveLang(@RequestBody Language language){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(language));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Language> updateLang(@PathVariable Long id, @RequestBody LanguageDto dto){
        Language saved = service.update(id, dto);
        return ResponseEntity.status(HttpStatus.OK).body(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLang(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
