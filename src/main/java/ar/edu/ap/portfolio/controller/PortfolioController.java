package ar.edu.ap.portfolio.controller;

import ar.edu.ap.portfolio.dto.PortfolioDto;
import ar.edu.ap.portfolio.entity.Portfolio;
import ar.edu.ap.portfolio.service.PortfolioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/portfolio")
public class PortfolioController {

    @Autowired
    public PortfolioService portfolioService;

    @GetMapping()
    public ResponseEntity<Portfolio> getPortfolio(){
        Portfolio pf = portfolioService.get();
        return ResponseEntity.ok().body(pf);
    }

    @PostMapping
    public ResponseEntity<Portfolio> save(@Valid @RequestBody PortfolioDto dto){
        Portfolio pf = portfolioService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(pf);
    }




}
