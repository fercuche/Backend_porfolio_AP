package ar.edu.ap.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class ExperienceDto implements Serializable {
    private final String jobTitle;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final String companyLogo;
    private final String jobDescription;
}
