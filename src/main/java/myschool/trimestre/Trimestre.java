package myschool.trimestre;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trimestre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String nomAnglais;
    private String abreviation;
    private String abreviationAnglais;

    public Trimestre() {
    }

    public Trimestre(Long id, String nom, String nomAnglais, String abreviation, String abreviationAnglais) {
        this.id = id;
        this.nom = nom;
        this.nomAnglais = nomAnglais;
        this.abreviation = abreviation;
        this.abreviationAnglais = abreviationAnglais;
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
}
