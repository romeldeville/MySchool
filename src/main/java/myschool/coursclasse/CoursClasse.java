package myschool.coursclasse;

import jakarta.persistence.*;
import myschool.classe.Classe;
import myschool.coursniveau.CoursNiveau;
import myschool.enseignant.Enseignant;


@Entity
public class CoursClasse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private CoursNiveau coursNiveau;
    @ManyToOne
    private Classe classe;
    @ManyToOne
    private Enseignant enseignant;

    public CoursClasse() {
    }

    public CoursClasse(Long id, CoursNiveau coursNiveau, Classe classe, Enseignant enseignant) {
        this.id = id;
        this.coursNiveau = coursNiveau;
        this.classe = classe;
        this.enseignant = enseignant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CoursNiveau getCoursNiveau() {
        return coursNiveau;
    }

    public void setCoursNiveau(CoursNiveau coursNiveau) {
        this.coursNiveau = coursNiveau;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }
}
