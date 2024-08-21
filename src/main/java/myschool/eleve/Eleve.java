package myschool.eleve;

import jakarta.persistence.*;
import myschool.classe.Classe;

import java.util.Date;


@Entity
public class Eleve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private String lieuDeNaissance;
    private String sexe;
    private String nomDuPere;
    private String nomDeLaMere;
    private String nomDuTuteur;
    private String matricule;
    @ManyToOne
    private Classe classe;
    private boolean redouble;
    private String telephone;

    public Eleve() {
    }

    public Eleve(Long id, String nom, String prenom, Date dateDeNaissance, String lieuDeNaissance, String sexe, String nomDuPere, String nomDeLaMere, String nomDuTuteur, String matricule, Classe classe, boolean redouble, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.lieuDeNaissance = lieuDeNaissance;
        this.sexe = sexe;
        this.nomDuPere = nomDuPere;
        this.nomDeLaMere = nomDeLaMere;
        this.nomDuTuteur = nomDuTuteur;
        this.matricule = matricule;
        this.classe = classe;
        this.redouble = redouble;
        this.telephone = telephone;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getLieuDeNaissance() {
        return lieuDeNaissance;
    }

    public void setLieuDeNaissance(String lieuDeNaissance) {
        this.lieuDeNaissance = lieuDeNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNomDuPere() {
        return nomDuPere;
    }

    public void setNomDuPere(String nomDuPere) {
        this.nomDuPere = nomDuPere;
    }

    public String getNomDeLaMere() {
        return nomDeLaMere;
    }

    public void setNomDeLaMere(String nomDeLaMere) {
        this.nomDeLaMere = nomDeLaMere;
    }

    public String getNomDuTuteur() {
        return nomDuTuteur;
    }

    public void setNomDuTuteur(String nomDuTuteur) {
        this.nomDuTuteur = nomDuTuteur;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public boolean isRedouble() {
        return redouble;
    }

    public void setRedouble(boolean redouble) {
        this.redouble = redouble;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
