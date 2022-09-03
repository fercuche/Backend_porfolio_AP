package ar.edu.ap.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter

public class PortfolioDto implements Serializable {
    private Long id;
    private String name;
    private String lastname;
    private LocalDate dob;
    private String occupation;
    private String aboutMe;
    private String profileImg;
    private String headerImg;
}
