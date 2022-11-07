package ar.edu.ap.portfolio.service.impl;

import ar.edu.ap.portfolio.dto.EducationDto;
import ar.edu.ap.portfolio.entity.Education;
import ar.edu.ap.portfolio.exception.ParamNotFound;
import ar.edu.ap.portfolio.mapper.EducationMapper;
import ar.edu.ap.portfolio.repository.EducationRepository;
import ar.edu.ap.portfolio.service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EducationServiceImpl implements IEducationService {

    @Autowired
    private EducationRepository repository;

    @Autowired
    private EducationMapper mapper;

    public List<Education> getAll() {
        List<Education> educations = repository.findAll();
        if(educations.isEmpty()){
            throw new ParamNotFound("No se encuentra educación");
        }
        return educations;
    }

    public Education save(Education education) {
        return repository.save(education);
    }

    public Education update(Long id, EducationDto dto) {
        Optional<Education> response = repository.findById(id);
        if (!response.isPresent()){
            throw new ParamNotFound("El id" + id + "no se encuentra");
        }
        Education edu = response.get();
        Education updateEdu = mapper.updateEducationFromEducationDto(dto,edu);
        return repository.save(updateEdu);
    }

    public void delete(Long id) {
        Optional<Education> edu = repository.findById(id);
        if (!edu.isPresent()){
            throw new ParamNotFound("No se encuentra el id " + id);
        }
        repository.deleteById(id);
    }
}
