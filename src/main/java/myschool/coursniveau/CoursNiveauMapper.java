package myschool.coursniveau;

public class CoursNiveauMapper {
    public static CoursNiveauDTO toDTO(CoursNiveau coursNiveau) {
        return new CoursNiveauDTO(
                coursNiveau.getId(),
                coursNiveau.getNiveau().getId(),
                coursNiveau.getNbreDHeureHebdomadaire(),
                coursNiveau.getMatiere().getId(),
                coursNiveau.getGroupe(),
                coursNiveau.getCoefficient()
        );
    }

    public static CoursNiveau fromDTO(CoursNiveauDTO coursNiveauDTO) {
        CoursNiveau coursNiveau = new CoursNiveau();
        coursNiveau.setId(coursNiveauDTO.id());
        coursNiveau.getNiveau().setId(coursNiveauDTO.idNiveau());
        coursNiveau.setNbreDHeureHebdomadaire(coursNiveauDTO.nbreDHeureHebdomadaire());
        coursNiveau.getMatiere().setId(coursNiveauDTO.idMatiere());
        coursNiveau.setGroupe(coursNiveauDTO.groupe());
        coursNiveau.setCoefficient(coursNiveauDTO.coefficient());
        return coursNiveau;
    }
}
