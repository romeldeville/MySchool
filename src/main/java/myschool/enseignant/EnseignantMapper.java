package myschool.enseignant;

public class EnseignantMapper {
    public static EnseignantDTO toDTO(Enseignant enseignant) {
        return new EnseignantDTO(
                enseignant.getId(),
                enseignant.getNom(),
                enseignant.getPrenom(),
                enseignant.getSexe(),
                enseignant.getTelephone(),
                enseignant.getDiplome(),
                enseignant.getSpecialite(),
                enseignant.getGrade(),
                enseignant.getFonction(),
                enseignant.getStatut(),
                enseignant.getDateArrivee(),
                enseignant.getMotifArrivee(),
                enseignant.getMatricule(),
                enseignant.getPseudonyme(),
                enseignant.getMotDePasse(),
                enseignant.getEtablissement().getId()
        );
    }

    public static Enseignant fromDTO(EnseignantDTO enseignantDTO) {
        Enseignant enseignant = new Enseignant();
        enseignant.setId(enseignantDTO.id());
        enseignant.setNom(enseignantDTO.nom());
        enseignant.setPrenom(enseignantDTO.prenom());
        enseignant.setSexe(enseignantDTO.sexe());
        enseignant.setTelephone(enseignantDTO.telephone());
        enseignant.setDiplome(enseignantDTO.diplome());
        enseignant.setSpecialite(enseignantDTO.specialite());
        enseignant.setGrade(enseignantDTO.grade());
        enseignant.setFonction(enseignantDTO.fonction());
        enseignant.setStatut(enseignantDTO.statut());
        enseignant.setDateArrivee(enseignantDTO.dateArrivee());
        enseignant.setMotifArrivee(enseignantDTO.motifArrivee());
        enseignant.setMatricule(enseignantDTO.matricule());
        enseignant.setPseudonyme(enseignantDTO.pseudonyme());
        enseignant.setMotDePasse(enseignantDTO.motDePasse());
        enseignant.getEtablissement().setId(enseignantDTO.idEtablissement());
        return enseignant;
    }
}
