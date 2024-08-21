package myschool.etablissement;

public class EtablissementMapper {
    public static EtablissementDTO toDTO(Etablissement etablissement) {
        return new EtablissementDTO(
                etablissement.getId(),
                etablissement.getPays(),
                etablissement.getDevisePays(),
                etablissement.getMinistere(),
                etablissement.getDelegationRegionale(),
                etablissement.getDelegationDepartementale(),
                etablissement.getArrondissement(),
                etablissement.getVilleVillage(),
                etablissement.getLocalisation(),
                etablissement.getNom(),
                etablissement.getAbreviation(),
                etablissement.getDeviseEtablissement(),
                etablissement.getPaysAnlais(),
                etablissement.getDevisePaysAnlais(),
                etablissement.getMinistereAnlais(),
                etablissement.getDelegationRegionaleAnlais(),
                etablissement.getDelegationDepartementaleAnlais(),
                etablissement.getArrondissementAnlais(),
                etablissement.getVilleVillageAnlais(),
                etablissement.getLocalisationAnlais(),
                etablissement.getNomAnlais(),
                etablissement.getAbreviationAnlais(),
                etablissement.getDeviseEtablissementAnlais(),
                etablissement.getTelephone(),
                etablissement.getBoitePostale(),
                etablissement.getFax(),
                etablissement.getImmatriculation(),
                etablissement.getEmail(),
                etablissement.getDateCreation(),
                etablissement.getLogo(),
                etablissement.getAnneeScolaire().getId()
        );
    }

    public static Etablissement fromDTO(EtablissementDTO etablissementDTO) {
        Etablissement etablissement = new Etablissement();
        etablissement.setId(etablissementDTO.id());
        etablissement.setPays(etablissementDTO.pays());
        etablissement.setDevisePays(etablissementDTO.devisePays());
        etablissement.setMinistere(etablissementDTO.ministere());
        etablissement.setDelegationRegionale(etablissementDTO.delegationRegionale());
        etablissement.setDelegationDepartementale(etablissementDTO.delegationDepartementale());
        etablissement.setArrondissement(etablissementDTO.arrondissement());
        etablissement.setVilleVillage(etablissementDTO.villeVillage());
        etablissement.setLocalisation(etablissementDTO.localisation());
        etablissement.setNom(etablissementDTO.nom());
        etablissement.setAbreviation(etablissementDTO.abreviation());
        etablissement.setDeviseEtablissement(etablissementDTO.deviseEtablissement());
        etablissement.setPaysAnlais(etablissementDTO.paysAnlais());
        etablissement.setDevisePaysAnlais(etablissementDTO.devisePaysAnlais());
        etablissement.setMinistereAnlais(etablissementDTO.ministereAnlais());
        etablissement.setDelegationRegionaleAnlais(etablissementDTO.delegationRegionaleAnlais());
        etablissement.setDelegationDepartementaleAnlais(etablissementDTO.delegationDepartementaleAnlais());
        etablissement.setArrondissementAnlais(etablissementDTO.arrondissementAnlais());
        etablissement.setVilleVillageAnlais(etablissementDTO.villeVillageAnlais());
        etablissement.setLocalisationAnlais(etablissementDTO.localisationAnlais());
        etablissement.setNomAnlais(etablissementDTO.nomAnlais());
        etablissement.setAbreviationAnlais(etablissementDTO.abreviationAnlais());
        etablissement.setDeviseEtablissementAnlais(etablissementDTO.deviseEtablissementAnlais());
        etablissement.setTelephone(etablissementDTO.telephone());
        etablissement.setBoitePostale(etablissementDTO.boitePostale());
        etablissement.setFax(etablissementDTO.fax());
        etablissement.setImmatriculation(etablissementDTO.immatriculation());
        etablissement.setEmail(etablissementDTO.email());
        etablissement.setDateCreation(etablissementDTO.dateCreation());
        etablissement.setLogo(etablissementDTO.logo());
        etablissement.getAnneeScolaire().setId(etablissementDTO.idAnneeScolaire());
        return etablissement;
    }

}
