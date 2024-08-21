package myschool.cycle;

import jakarta.persistence.*;
import myschool.section.Section;


@Entity
public class Cycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String abreviation;
    @ManyToOne
    private Section section;

    public Cycle() {
        this.section = new Section();
    }

    public Cycle(Long id, String nom, String abreviation, Section section) {
        this.id = id;
        this.nom = nom;
        this.abreviation = abreviation;
        this.section = section;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
}
