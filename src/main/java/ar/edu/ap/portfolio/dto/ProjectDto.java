package ar.edu.ap.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class ProjectDto implements Serializable {
    private final String name;
    private final LocalDate developDate;
    private final String description;
    private final String url;
    private final String image;
}
