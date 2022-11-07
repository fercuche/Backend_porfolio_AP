package ar.edu.ap.portfolio.controller;

import ar.edu.ap.portfolio.dto.PortfolioDto;
import ar.edu.ap.portfolio.entity.Portfolio;
import ar.edu.ap.portfolio.service.IPortfolioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200","https://portfolioap-184a7.web.app"})
@RequestMapping("/portfolio")
public class PortfolioController {

    @Autowired
    public IPortfolioService IPortfolioService;

    @GetMapping("/{id}")
    public ResponseEntity<Portfolio> get(@PathVariable Long id){
        Portfolio pf = IPortfolioService.get(id);
        return ResponseEntity.ok().body(pf);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Portfolio> update(@PathVariable Long id, @Valid @RequestBody PortfolioDto dto){
        Portfolio result = IPortfolioService.update(id, dto);
        return ResponseEntity.ok().body(result);
    }

}
