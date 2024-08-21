package myschool.enseignant;

import jakarta.persistence.*;
import myschool.etablissement.Etablissement;

@Entity
public class Enseignant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String sexe;
    private String telephone;
    private String diplome;
    private String specialite;
    private String grade;
    private String fonction;
    private String statut;
    private String dateArrivee;
    private String motifArrivee;
    private String matricule;
    private String pseudonyme;
    private String motDePasse;
    @ManyToOne
    private Etablissement etablissement;

    public Enseignant() {
        this.etablissement = new Etablissement();
    }

    public Enseignant(Long id, String nom, String prenom, String sexe, String telephone, String diplome, String specialite, String grade, String fonction, String statut, String dateArrivee, String motifArrivee, String matricule, String pseudonyme, String motDePasse, Etablissement etablissement) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.telephone = telephone;
        this.diplome = diplome;
        this.specialite = specialite;
        this.grade = grade;
        this.fonction = fonction;
        this.statut = statut;
        this.dateArrivee = dateArrivee;
        this.motifArrivee = motifArrivee;
        this.matricule = matricule;
        this.pseudonyme = pseudonyme;
        this.motDePasse = motDePasse;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(String dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public String getMotifArrivee() {
        return motifArrivee;
    }

    public void setMotifArrivee(String motifArrivee) {
        this.motifArrivee = motifArrivee;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPseudonyme() {
        return pseudonyme;
    }

    public void setPseudonyme(String pseudonyme) {
        this.pseudonyme = pseudonyme;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }
}
