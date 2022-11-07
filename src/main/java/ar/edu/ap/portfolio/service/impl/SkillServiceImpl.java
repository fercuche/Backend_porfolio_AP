package ar.edu.ap.portfolio.service.impl;

import ar.edu.ap.portfolio.dto.SkillDto;
import ar.edu.ap.portfolio.entity.Skill;
import ar.edu.ap.portfolio.exception.ParamNotFound;
import ar.edu.ap.portfolio.mapper.SkillMapper;
import ar.edu.ap.portfolio.repository.SkillRepository;
import ar.edu.ap.portfolio.service.ISkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillServiceImpl implements ISkillService {

    @Autowired
    private SkillRepository repository;

    @Autowired
    private SkillMapper mapper;


    public List<Skill> getAll() {
        List<Skill> skills = repository.findAll();
        if (skills.isEmpty()){
            throw new ParamNotFound("No se encontraron skills");
        }
        return skills;
    }

    public Skill save(Skill skill) {
        return repository.save(skill);
    }

    public Skill update(Long id, SkillDto dto) {
        Optional<Skill> response = repository.findById(id);
        if (!response.isPresent()) {
            throw new ParamNotFound("El id" + id + "no se encuentra");
        }
        Skill skill = response.get();
        Skill updateSkill = mapper.updateSkillFromSkillDto(dto, skill);
        return repository.save(updateSkill);
    }

    public void delete(Long id) {
        Optional<Skill> skill = repository.findById(id);
        if (!skill.isPresent()) {
            throw new ParamNotFound("No se encuentra el id " + id);
        }
        repository.deleteById(id);
    }
}
