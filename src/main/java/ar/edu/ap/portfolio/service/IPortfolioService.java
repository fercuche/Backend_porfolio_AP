package ar.edu.ap.portfolio.service;

import ar.edu.ap.portfolio.dto.PortfolioDto;
import ar.edu.ap.portfolio.entity.Portfolio;

public interface IPortfolioService {

    Portfolio get(Long id);
    Portfolio save(Portfolio dto);
    Portfolio update(Long id, PortfolioDto dto);

}
