package ar.edu.ap.portfolio.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobTitle;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate startDate;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate endDate;

    private String companyLogo;
    private String jobDescription;

    @Column(name = "portfolio_id")
    private Long portfolioId;
    /*@ManyToOne
    @JoinColumn(name = "portfolio_id", referencedColumnName = "id")
    private Portfolio portfolio;*/


}
