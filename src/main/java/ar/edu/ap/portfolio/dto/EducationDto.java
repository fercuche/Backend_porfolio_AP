package ar.edu.ap.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class EducationDto implements Serializable {
    private final String title;
    private final String institution;
    private final String logo;
    private final LocalDate startDate;
    private final LocalDate endDate;
}
