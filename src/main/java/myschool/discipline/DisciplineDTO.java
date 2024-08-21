package myschool.discipline;

public record DisciplineDTO(
        Integer absenceJustifiee,
        Integer absenceNonJustifiee,
        Integer avertissement,
        Integer blame,
        Integer consigne,
        Integer exclusion,
        Integer retard,
        Long idSequence,
        Long idEleve
) {
}
