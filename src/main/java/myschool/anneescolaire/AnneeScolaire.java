package myschool.anneescolaire;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class AnneeScolaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "'nom' doit avoir une valeur")
    private String nom;

    public AnneeScolaire() {
    }

    public AnneeScolaire(Long id, @NotNull(message = "'nom' doit avoir une valeur") String nom) {
        this.id = id;
        this.nom = nom;
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

    @Override
    public String toString() {
        return "AnneeScolaire{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
