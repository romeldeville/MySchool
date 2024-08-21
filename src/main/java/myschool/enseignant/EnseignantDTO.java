package myschool.enseignant;

public record EnseignantDTO(
        Long id,
        String nom,
        String prenom,
        String sexe,
        String telephone,
        String diplome,
        String specialite,
        String grade,
        String fonction,
        String statut,
        String dateArrivee,
        String motifArrivee,
        String matricule,
        String pseudonyme,
        String motDePasse,
        Long idEtablissement
) {
}
