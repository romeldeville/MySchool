package myschool.niveau;

public record NiveauDTO(
        Long id,
        String nom,
        Double moyenneDePassage,
        String examen,
        Long idSection
) {
}
