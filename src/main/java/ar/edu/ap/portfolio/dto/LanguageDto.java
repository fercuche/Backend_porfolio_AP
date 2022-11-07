package ar.edu.ap.portfolio.dto;

import ar.edu.ap.portfolio.enums.LanguageLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class LanguageDto implements Serializable {
    private final String name;
    private final LanguageLevel level;
}
