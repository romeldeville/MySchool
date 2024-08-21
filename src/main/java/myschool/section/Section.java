package myschool.section;

import jakarta.persistence.*;
import myschool.etablissement.Etablissement;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String abreviation;
    @ManyToOne
    private Etablissement etablissement;

    public Section() {
        this.etablissement = new Etablissement();
    }

    public Section(Long id, String nom, String abreviation, Etablissement etablissement) {
        this.id = id;
        this.nom = nom;
        this.abreviation = abreviation;
        this.etablissement = etablissement;
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

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }
}
