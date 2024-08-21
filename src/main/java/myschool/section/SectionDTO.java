package myschool.section;

public record SectionDTO(
        Long id,
        String nom,
        String abreviation,
        Long idEtablissement
) {
}
