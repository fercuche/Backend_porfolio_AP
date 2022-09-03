package ar.edu.ap.portfolio.entity;

import ar.edu.ap.portfolio.enums.SkillType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id", nullable = false)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private SkillType type;

    private Integer percentage;


    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

}
