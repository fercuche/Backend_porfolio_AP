package ar.edu.ap.portfolio.service;

import ar.edu.ap.portfolio.entity.Skill;

import java.util.List;

public interface SkillService {

    List<Skill> getAll();
    Skill getById(Long id);
    Skill save(Skill skill);
    Skill update(Long id, Skill skill);
    void delete(Long id);
}
