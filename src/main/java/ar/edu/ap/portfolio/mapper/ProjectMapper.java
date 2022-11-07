package ar.edu.ap.portfolio.mapper;

import ar.edu.ap.portfolio.dto.ProjectDto;
import ar.edu.ap.portfolio.entity.Project;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    Project projectDtoToProject(ProjectDto projectDto);

    ProjectDto projectToProjectDto(Project project);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Project updateProjectFromProjectDto(ProjectDto projectDto, @MappingTarget Project project);
}
