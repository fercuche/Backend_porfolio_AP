package ar.edu.ap.portfolio.mapper;

import ar.edu.ap.portfolio.dto.EducationDto;
import ar.edu.ap.portfolio.entity.Education;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface EducationMapper {

    Education educationDtoToEducation(EducationDto educationDto);

    EducationDto educationToEducationDto(Education education);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Education updateEducationFromEducationDto(EducationDto educationDto, @MappingTarget Education education);
}
