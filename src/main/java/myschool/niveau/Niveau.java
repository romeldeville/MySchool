package myschool.niveau;

import jakarta.persistence.*;
import myschool.section.Section;

@Entity
public class Niveau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Double moyenneDePassage;
    private String examen;
    @ManyToOne
    private Section section;

    public Niveau() {
    }

    public Niveau(Long id, String nom, Double moyenneDePassage, String examen, Section section) {
        this.id = id;
        this.nom = nom;
        this.moyenneDePassage = moyenneDePassage;
        this.examen = examen;
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

    public Double getMoyenneDePassage() {
        return moyenneDePassage;
    }

    public void setMoyenneDePassage(Double moyenneDePassage) {
        this.moyenneDePassage = moyenneDePassage;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
}
