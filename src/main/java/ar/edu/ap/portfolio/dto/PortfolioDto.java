package ar.edu.ap.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class PortfolioDto implements Serializable {
    private final String name;
    private final String lastname;
    private final LocalDate dob;
    private final String occupation;
    private final String aboutMe;
    private final String profileImg;
    private final String headerImg;
}
