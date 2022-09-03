package ar.edu.ap.portfolio.mapper;

import ar.edu.ap.portfolio.dto.PortfolioDto;
import ar.edu.ap.portfolio.entity.Portfolio;
import org.mapstruct.Mapper;

@Mapper
public interface PortfolioMapper {

    PortfolioDto portfolio2dto(Portfolio portfolio);

    Portfolio dto2Portfolio(PortfolioDto dto);

}
