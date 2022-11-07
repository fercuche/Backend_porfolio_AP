package ar.edu.ap.portfolio.mapper;

import ar.edu.ap.portfolio.dto.LanguageDto;
import ar.edu.ap.portfolio.entity.Language;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface LanguageMapper {
    Language languageDtoToLanguage(LanguageDto languageDto);

    LanguageDto languageToLanguageDto(Language language);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Language updateLanguageFromLanguageDto(LanguageDto languageDto, @MappingTarget Language language);
}
