package myschool.coursclasse;

public class CoursClasseMapper {
    public static CoursClasseDTO toDTO(CoursClasse coursClasse) {
        return new CoursClasseDTO(
                coursClasse.getId(),
                coursClasse.getCoursNiveau().getId(),
                coursClasse.getClasse().getId(),
                coursClasse.getEnseignant().getId()
        );
    }

    public static CoursClasse fromDTO(CoursClasseDTO coursClasseDTO) {
        CoursClasse coursClasse = new CoursClasse();
        coursClasse.setId(coursClasseDTO.id());
        coursClasse.getCoursNiveau().setId(coursClasseDTO.idCoursNiveau());
        coursClasse.getClasse().setId(coursClasseDTO.idClasse());
        coursClasse.getEnseignant().setId(coursClasseDTO.idEnseignant());
        return coursClasse;
    }
}
