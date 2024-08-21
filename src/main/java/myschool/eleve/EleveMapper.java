package myschool.eleve;

public class EleveMapper {
    public static EleveDTO toDTO(Eleve eleve) {
        return new EleveDTO(
                eleve.getId(),
                eleve.getNom(),
                eleve.getPrenom(),
                eleve.getDateDeNaissance(),
                eleve.getLieuDeNaissance(),
                eleve.getSexe(),
                eleve.getNomDuPere(),
                eleve.getNomDeLaMere(),
                eleve.getNomDuTuteur(),
                eleve.getMatricule(),
                eleve.getClasse().getId(),
                eleve.isRedouble(),
                eleve.getTelephone()
        );
    }

    public static Eleve fromDTO(EleveDTO eleveDTO) {
        Eleve eleve = new Eleve();
        eleve.setId(eleveDTO.id());
        eleve.setNom(eleveDTO.nom());
        eleve.setPrenom(eleveDTO.prenom());
        eleve.setDateDeNaissance(eleveDTO.dateDeNaissance());
        eleve.setLieuDeNaissance(eleveDTO.lieuDeNaissance());
        eleve.setSexe(eleveDTO.sexe());
        eleve.setNomDuPere(eleveDTO.nomDuPere());
        eleve.setNomDeLaMere(eleveDTO.nomDeLaMere());
        eleve.setNomDuTuteur(eleveDTO.nomDuTuteur());
        eleve.setMatricule(eleveDTO.matricule());
        eleve.getClasse().setId(eleveDTO.idClasse());
        eleve.setRedouble(eleveDTO.redouble());
        eleve.setTelephone(eleveDTO.telephone());
        return eleve;
    }
}
