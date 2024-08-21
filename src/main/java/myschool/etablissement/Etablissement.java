package myschool.etablissement;

import jakarta.persistence.*;
import myschool.anneescolaire.AnneeScolaire;

import java.util.Date;

@Entity
public class Etablissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pays;
    private String devisePays;
    private String ministere;
    private String delegationRegionale;
    private String delegationDepartementale;
    private String arrondissement;
    private String villeVillage;
    private String localisation;
    private String nom;
    private String abreviation;
    private String deviseEtablissement;

    private String paysAnlais;
    private String devisePaysAnlais;
    private String ministereAnlais;
    private String delegationRegionaleAnlais;
    private String delegationDepartementaleAnlais;
    private String arrondissementAnlais;
    private String villeVillageAnlais;
    private String localisationAnlais;
    private String nomAnlais;
    private String abreviationAnlais;
    private String deviseEtablissementAnlais;

    private String telephone;
    private String boitePostale;
    private String fax;
    private String immatriculation;
    private String email;
    private Date dateCreation;
    private String logo;

    @ManyToOne
    private AnneeScolaire anneeScolaire;


    public Etablissement() {
        this.anneeScolaire = new AnneeScolaire();
    }

    public Etablissement(Long id, String pays, String devisePays, String ministere, String delegationRegionale, String delegationDepartementale, String arrondissement, String villeVillage, String localisation, String nom, String abreviation, String deviseEtablissement, String paysAnlais, String devisePaysAnlais, String ministereAnlais, String delegationRegionaleAnlais, String delegationDepartementaleAnlais, String arrondissementAnlais, String villeVillageAnlais, String localisationAnlais, String nomAnlais, String abreviationAnlais, String deviseEtablissementAnlais, String telephone, String boitePostale, String fax, String immatriculation, String email, Date dateCreation, String logo, AnneeScolaire anneeScolaire) {
        this.id = id;
        this.pays = pays;
        this.devisePays = devisePays;
        this.ministere = ministere;
        this.delegationRegionale = delegationRegionale;
        this.delegationDepartementale = delegationDepartementale;
        this.arrondissement = arrondissement;
        this.villeVillage = villeVillage;
        this.localisation = localisation;
        this.nom = nom;
        this.abreviation = abreviation;
        this.deviseEtablissement = deviseEtablissement;
        this.paysAnlais = paysAnlais;
        this.devisePaysAnlais = devisePaysAnlais;
        this.ministereAnlais = ministereAnlais;
        this.delegationRegionaleAnlais = delegationRegionaleAnlais;
        this.delegationDepartementaleAnlais = delegationDepartementaleAnlais;
        this.arrondissementAnlais = arrondissementAnlais;
        this.villeVillageAnlais = villeVillageAnlais;
        this.localisationAnlais = localisationAnlais;
        this.nomAnlais = nomAnlais;
        this.abreviationAnlais = abreviationAnlais;
        this.deviseEtablissementAnlais = deviseEtablissementAnlais;
        this.telephone = telephone;
        this.boitePostale = boitePostale;
        this.fax = fax;
        this.immatriculation = immatriculation;
        this.email = email;
        this.dateCreation = dateCreation;
        this.logo = logo;
        this.anneeScolaire = anneeScolaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getDevisePays() {
        return devisePays;
    }

    public void setDevisePays(String devisePays) {
        this.devisePays = devisePays;
    }

    public String getMinistere() {
        return ministere;
    }

    public void setMinistere(String ministere) {
        this.ministere = ministere;
    }

    public String getDelegationRegionale() {
        return delegationRegionale;
    }

    public void setDelegationRegionale(String delegationRegionale) {
        this.delegationRegionale = delegationRegionale;
    }

    public String getDelegationDepartementale() {
        return delegationDepartementale;
    }

    public void setDelegationDepartementale(String delegationDepartementale) {
        this.delegationDepartementale = delegationDepartementale;
    }

    public String getArrondissement() {
        return arrondissement;
    }

    public void setArrondissement(String arrondissement) {
        this.arrondissement = arrondissement;
    }

    public String getVilleVillage() {
        return villeVillage;
    }

    public void setVilleVillage(String villeVillage) {
        this.villeVillage = villeVillage;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
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

    public String getDeviseEtablissement() {
        return deviseEtablissement;
    }

    public void setDeviseEtablissement(String deviseEtablissement) {
        this.deviseEtablissement = deviseEtablissement;
    }

    public String getPaysAnlais() {
        return paysAnlais;
    }

    public void setPaysAnlais(String paysAnlais) {
        this.paysAnlais = paysAnlais;
    }

    public String getDevisePaysAnlais() {
        return devisePaysAnlais;
    }

    public void setDevisePaysAnlais(String devisePaysAnlais) {
        this.devisePaysAnlais = devisePaysAnlais;
    }

    public String getMinistereAnlais() {
        return ministereAnlais;
    }

    public void setMinistereAnlais(String ministereAnlais) {
        this.ministereAnlais = ministereAnlais;
    }

    public String getDelegationRegionaleAnlais() {
        return delegationRegionaleAnlais;
    }

    public void setDelegationRegionaleAnlais(String delegationRegionaleAnlais) {
        this.delegationRegionaleAnlais = delegationRegionaleAnlais;
    }

    public String getDelegationDepartementaleAnlais() {
        return delegationDepartementaleAnlais;
    }

    public void setDelegationDepartementaleAnlais(String delegationDepartementaleAnlais) {
        this.delegationDepartementaleAnlais = delegationDepartementaleAnlais;
    }

    public String getArrondissementAnlais() {
        return arrondissementAnlais;
    }

    public void setArrondissementAnlais(String arrondissementAnlais) {
        this.arrondissementAnlais = arrondissementAnlais;
    }

    public String getVilleVillageAnlais() {
        return villeVillageAnlais;
    }

    public void setVilleVillageAnlais(String villeVillageAnlais) {
        this.villeVillageAnlais = villeVillageAnlais;
    }

    public String getLocalisationAnlais() {
        return localisationAnlais;
    }

    public void setLocalisationAnlais(String localisationAnlais) {
        this.localisationAnlais = localisationAnlais;
    }

    public String getNomAnlais() {
        return nomAnlais;
    }

    public void setNomAnlais(String nomAnlais) {
        this.nomAnlais = nomAnlais;
    }

    public String getAbreviationAnlais() {
        return abreviationAnlais;
    }

    public void setAbreviationAnlais(String abreviationAnlais) {
        this.abreviationAnlais = abreviationAnlais;
    }

    public String getDeviseEtablissementAnlais() {
        return deviseEtablissementAnlais;
    }

    public void setDeviseEtablissementAnlais(String deviseEtablissementAnlais) {
        this.deviseEtablissementAnlais = deviseEtablissementAnlais;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getBoitePostale() {
        return boitePostale;
    }

    public void setBoitePostale(String boitePostale) {
        this.boitePostale = boitePostale;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public AnneeScolaire getAnneeScolaire() {
        return anneeScolaire;
    }

    public void setAnneeScolaire(AnneeScolaire anneeScolaire) {
        this.anneeScolaire = anneeScolaire;
    }

    @Override
    public String toString() {
        return "Etablissement{" +
                "id=" + id +
                ", pays='" + pays + '\'' +
                ", devisePays='" + devisePays + '\'' +
                ", ministere='" + ministere + '\'' +
                ", delegationRegionale='" + delegationRegionale + '\'' +
                ", delegationDepartementale='" + delegationDepartementale + '\'' +
                ", arrondissement='" + arrondissement + '\'' +
                ", villeVillage='" + villeVillage + '\'' +
                ", localisation='" + localisation + '\'' +
                ", nom='" + nom + '\'' +
                ", abreviation='" + abreviation + '\'' +
                ", deviseEtablissement='" + deviseEtablissement + '\'' +
                ", paysAnlais='" + paysAnlais + '\'' +
                ", devisePaysAnlais='" + devisePaysAnlais + '\'' +
                ", ministereAnlais='" + ministereAnlais + '\'' +
                ", delegationRegionaleAnlais='" + delegationRegionaleAnlais + '\'' +
                ", delegationDepartementaleAnlais='" + delegationDepartementaleAnlais + '\'' +
                ", arrondissementAnlais='" + arrondissementAnlais + '\'' +
                ", villeVillageAnlais='" + villeVillageAnlais + '\'' +
                ", localisationAnlais='" + localisationAnlais + '\'' +
                ", nomAnlais='" + nomAnlais + '\'' +
                ", abreviationAnlais='" + abreviationAnlais + '\'' +
                ", deviseEtablissementAnlais='" + deviseEtablissementAnlais + '\'' +
                ", telephone='" + telephone + '\'' +
                ", boitePostale='" + boitePostale + '\'' +
                ", fax='" + fax + '\'' +
                ", immatriculation='" + immatriculation + '\'' +
                ", email='" + email + '\'' +
                ", dateCreation=" + dateCreation +
                ", logo='" + logo + '\'' +
                ", anneeScolaire=" + anneeScolaire +
                '}';
    }
}
