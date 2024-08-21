package myschool.coursniveau;

import jakarta.persistence.*;
import myschool.matiere.Matiere;
import myschool.niveau.Niveau;

@Entity
public class CoursNiveau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Niveau niveau;
    private Integer nbreDHeureHebdomadaire;
    @ManyToOne
    private Matiere matiere;
    private String groupe;
    private Double coefficient;

    public CoursNiveau() {
    }

    public CoursNiveau(Long id, Niveau niveau, Integer nbreDHeureHebdomadaire, Matiere matiere, String groupe, Double coefficient) {
        this.id = id;
        this.niveau = niveau;
        this.nbreDHeureHebdomadaire = nbreDHeureHebdomadaire;
        this.matiere = matiere;
        this.groupe = groupe;
        this.coefficient = coefficient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public Integer getNbreDHeureHebdomadaire() {
        return nbreDHeureHebdomadaire;
    }

    public void setNbreDHeureHebdomadaire(Integer nbreDHeureHebdomadaire) {
        this.nbreDHeureHebdomadaire = nbreDHeureHebdomadaire;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }
}
