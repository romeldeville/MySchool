package myschool.classe;

import jakarta.persistence.*;
import myschool.enseignant.Enseignant;
import myschool.niveau.Niveau;


@Entity
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @ManyToOne
    private Niveau niveau;
    @ManyToOne
    private Enseignant professeurPrincipal;

    public Classe() {
    }

    public Classe(Long id, String nom, Niveau niveau, Enseignant professeurPrincipal) {
        this.id = id;
        this.nom = nom;
        this.niveau = niveau;
        this.professeurPrincipal = professeurPrincipal;
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

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public Enseignant getProfesseurPrincipal() {
        return professeurPrincipal;
    }

    public void setProfesseurPrincipal(Enseignant professeurPrincipal) {
        this.professeurPrincipal = professeurPrincipal;
    }
}
