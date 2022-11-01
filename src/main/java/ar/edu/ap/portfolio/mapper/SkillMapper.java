package ar.edu.ap.portfolio.mapper;

import ar.edu.ap.portfolio.dto.SkillDto;
import ar.edu.ap.portfolio.entity.Skill;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface SkillMapper {
    Skill skillDtoToSkill(SkillDto skillDto);

    SkillDto skillToSkillDto(Skill skill);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Skill updateSkillFromSkillDto(SkillDto skillDto, @MappingTarget Skill skill);
}
