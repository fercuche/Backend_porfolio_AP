package ar.edu.ap.portfolio.service;

import ar.edu.ap.portfolio.dto.SkillDto;
import ar.edu.ap.portfolio.entity.Skill;

import java.util.List;

public interface ISkillService {

    List<Skill> getAll();
    Skill save(Skill skill);
    Skill update(Long id, SkillDto dto);
    void delete(Long id);
}
