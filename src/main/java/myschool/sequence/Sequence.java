package myschool.sequence;

import jakarta.persistence.*;
import myschool.trimestre.Trimestre;

@Entity
public class Sequence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String nomAnglais;
    private String abreviation;
    private String abreviationAnglais;
    @ManyToOne
    private Trimestre trimestre;

    public Sequence() {
    }

    public Sequence(Long id, String nom, String nomAnglais, String abreviation, String abreviationAnglais, Trimestre trimestre) {
        this.id = id;
        this.nom = nom;
        this.nomAnglais = nomAnglais;
        this.abreviation = abreviation;
        this.abreviationAnglais = abreviationAnglais;
        this.trimestre = trimestre;
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

    public String getNomAnglais() {
        return nomAnglais;
    }

    public void setNomAnglais(String nomAnglais) {
        this.nomAnglais = nomAnglais;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public String getAbreviationAnglais() {
        return abreviationAnglais;
    }

    public void setAbreviationAnglais(String abreviationAnglais) {
        this.abreviationAnglais = abreviationAnglais;
    }

    public Trimestre getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(Trimestre trimestre) {
        this.trimestre = trimestre;
    }
}
