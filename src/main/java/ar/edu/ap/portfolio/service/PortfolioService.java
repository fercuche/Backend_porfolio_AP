package ar.edu.ap.portfolio.service;

import ar.edu.ap.portfolio.dto.PortfolioDto;
import ar.edu.ap.portfolio.entity.Portfolio;

public interface PortfolioService {

    Portfolio get();
    Portfolio save(PortfolioDto dto);
    Portfolio update(Long id, PortfolioDto dto);

}
