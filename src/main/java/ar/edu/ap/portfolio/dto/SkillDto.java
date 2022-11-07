package ar.edu.ap.portfolio.dto;

import ar.edu.ap.portfolio.enums.SkillType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class SkillDto implements Serializable {
    private final String name;
    private final SkillType type;
    private final Integer percentage;
}
