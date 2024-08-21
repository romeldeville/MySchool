package myschool.discipline;

import jakarta.persistence.*;
import myschool.eleve.Eleve;
import myschool.sequence.Sequence;


@Entity
public class Discipline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer absenceJustifiee;
    private Integer absenceNonJustifiee;
    private Integer avertissement;
    private Integer blame;
    private Integer consigne;
    private Integer exclusion;
    private Integer retard;
    @ManyToOne
    private Sequence sequence;
    @ManyToOne
    private Eleve eleve;

    public Discipline() {
    }

    public Discipline(Long id, Integer absenceJustifiee, Integer absenceNonJustifiee, Integer avertissement, Integer blame, Integer consigne, Integer exclusion, Integer retard, Sequence sequence, Eleve eleve) {
        this.id = id;
        this.absenceJustifiee = absenceJustifiee;
        this.absenceNonJustifiee = absenceNonJustifiee;
        this.avertissement = avertissement;
        this.blame = blame;
        this.consigne = consigne;
        this.exclusion = exclusion;
        this.retard = retard;
        this.sequence = sequence;
        this.eleve = eleve;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAbsenceJustifiee() {
        return absenceJustifiee;
    }

    public void setAbsenceJustifiee(Integer absenceJustifiee) {
        this.absenceJustifiee = absenceJustifiee;
    }

    public Integer getAbsenceNonJustifiee() {
        return absenceNonJustifiee;
    }

    public void setAbsenceNonJustifiee(Integer absenceNonJustifiee) {
        this.absenceNonJustifiee = absenceNonJustifiee;
    }

    public Integer getAvertissement() {
        return avertissement;
    }

    public void setAvertissement(Integer avertissement) {
        this.avertissement = avertissement;
    }

    public Integer getBlame() {
        return blame;
    }

    public void setBlame(Integer blame) {
        this.blame = blame;
    }

    public Integer getConsigne() {
        return consigne;
    }

    public void setConsigne(Integer consigne) {
        this.consigne = consigne;
    }

    public Integer getExclusion() {
        return exclusion;
    }

    public void setExclusion(Integer exclusion) {
        this.exclusion = exclusion;
    }

    public Integer getRetard() {
        return retard;
    }

    public void setRetard(Integer retard) {
        this.retard = retard;
    }

    public Sequence getSequence() {
        return sequence;
    }

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }
}
