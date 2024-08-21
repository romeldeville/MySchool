package myschool.coursniveau;

public record CoursNiveauDTO(
        Long id,
        Long idNiveau,
        Integer nbreDHeureHebdomadaire,
        Long idMatiere,
        String groupe,
        Double coefficient
) {
}
