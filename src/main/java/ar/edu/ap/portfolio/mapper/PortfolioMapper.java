package ar.edu.ap.portfolio.mapper;

import ar.edu.ap.portfolio.dto.PortfolioDto;
import ar.edu.ap.portfolio.entity.Portfolio;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface PortfolioMapper {
    Portfolio portfolioDtoToPortfolio(PortfolioDto portfolioDto);

    PortfolioDto portfolioToPortfolioDto(Portfolio portfolio);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Portfolio updatePortfolioFromPortfolioDto(PortfolioDto portfolioDto, @MappingTarget Portfolio portfolio);
}