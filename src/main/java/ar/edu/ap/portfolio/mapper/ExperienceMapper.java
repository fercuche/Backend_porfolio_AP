package ar.edu.ap.portfolio.mapper;

import ar.edu.ap.portfolio.dto.ExperienceDto;
import ar.edu.ap.portfolio.entity.Experience;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface ExperienceMapper {
    Experience experienceDtoToExperience(ExperienceDto experienceDto);

    ExperienceDto experienceToExperienceDto(Experience experience);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Experience updateExperienceFromExperienceDto(ExperienceDto experienceDto, @MappingTarget Experience experience);
}
