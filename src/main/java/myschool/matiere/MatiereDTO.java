package myschool.matiere;

public record MatiereDTO(
        Long id,
        String nom,
        String abreviation,
        Long idEtablissement
) {
}
