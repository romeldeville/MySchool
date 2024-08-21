package myschool.discipline;

public class DisciplineMapper {
    public static DisciplineDTO toDTO(Discipline discipline) {
        return new DisciplineDTO(
                discipline.getAbsenceJustifiee(),
                discipline.getAbsenceNonJustifiee(),
                discipline.getAvertissement(),
                discipline.getBlame(),
                discipline.getConsigne(),
                discipline.getExclusion(),
                discipline.getRetard(),
                discipline.getSequence().getId(),
                discipline.getEleve().getId()
        );
    }

    public static Discipline fromDTO(DisciplineDTO disciplineDTO) {
        Discipline discipline = new Discipline();
        discipline.setAbsenceJustifiee(disciplineDTO.absenceJustifiee());
        discipline.setAbsenceNonJustifiee(disciplineDTO.absenceNonJustifiee());
        discipline.setAvertissement(disciplineDTO.avertissement());
        discipline.setBlame(disciplineDTO.blame());
        discipline.setConsigne(disciplineDTO.consigne());
        discipline.setExclusion(disciplineDTO.exclusion());
        discipline.setRetard(disciplineDTO.retard());
        discipline.getSequence().setId(disciplineDTO.idSequence());
        discipline.getEleve().setId(disciplineDTO.idEleve());
        return discipline;
    }
}
