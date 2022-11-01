package ar.edu.ap.portfolio.service.impl;

import ar.edu.ap.portfolio.dto.PortfolioDto;
import ar.edu.ap.portfolio.entity.Portfolio;
import ar.edu.ap.portfolio.exception.ParamNotFound;
import ar.edu.ap.portfolio.mapper.PortfolioMapper;
import ar.edu.ap.portfolio.repository.PortfolioRepository;
import ar.edu.ap.portfolio.service.IPortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PortfolioServiceImpl implements IPortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    @Autowired
    private PortfolioMapper mapper;

    @Transactional(readOnly = true)
    public Portfolio get(Long id) {
        return portfolioRepository.findById(id).orElseThrow(() ->
                new ParamNotFound("El portfolio con el id " + id +" no se encuentra"));
    }

    @Transactional
    public Portfolio save(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    @Transactional
    public Portfolio update(Long id, PortfolioDto dto) {
        Optional<Portfolio> result = portfolioRepository.findById(id);
        if(!result.isPresent()) {
            throw new ParamNotFound("No se encuentra el id" + id);
        }
        Portfolio pf = result.get();
        Portfolio updated = mapper.updatePortfolioFromPortfolioDto(dto, pf);
        return portfolioRepository.save(updated);
    }

}
