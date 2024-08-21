package myschool.etablissement;

import java.util.Date;

public record EtablissementDTO(
        Long id,
        String pays,
        String devisePays,
        String ministere,
        String delegationRegionale,
        String delegationDepartementale,
        String arrondissement,
        String villeVillage,
        String localisation,
        String nom,
        String abreviation,
        String deviseEtablissement,
        String paysAnlais,
        String devisePaysAnlais,
        String ministereAnlais,
        String delegationRegionaleAnlais,
        String delegationDepartementaleAnlais,
        String arrondissementAnlais,
        String villeVillageAnlais,
        String localisationAnlais,
        String nomAnlais,
        String abreviationAnlais,
        String deviseEtablissementAnlais,
        String telephone,
        String boitePostale,
        String fax,
        String immatriculation,
        String email,
        Date dateCreation,
        String logo,
        Long idAnneeScolaire
) {
}
