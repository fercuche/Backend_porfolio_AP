package ar.edu.ap.portfolio.service.impl;

import ar.edu.ap.portfolio.dto.PortfolioDto;
import ar.edu.ap.portfolio.entity.Portfolio;
import ar.edu.ap.portfolio.exception.ParamNotFound;
import ar.edu.ap.portfolio.mapper.PortfolioMapper;
import ar.edu.ap.portfolio.repository.PortfolioRepository;
import ar.edu.ap.portfolio.service.PortfolioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PortfolioServiceImpl implements PortfolioService {


    private final PortfolioRepository portfolioRepository;
    private final PortfolioMapper mapper;

    @Transactional(readOnly = true)
    public Portfolio get() {
        return (Portfolio) portfolioRepository.findAll();
    }

    @Transactional
    public Portfolio save(PortfolioDto dto) {
        Portfolio pf = mapper.dto2Portfolio(dto);
        return portfolioRepository.save(pf);
    }

    @Transactional
    public Portfolio update(Long id, PortfolioDto dto) {
        Optional<Portfolio> result = portfolioRepository.findById(id);
        if(!result.isPresent()) {
            throw new ParamNotFound("no se encuentra el id");
        }
        dto.setId(result.get().getId());
        Portfolio pf = mapper.dto2Portfolio(dto);
        return portfolioRepository.save(pf);
    }

}
