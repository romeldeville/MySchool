package myschool.matiere;

public class MatiereMapper {
    public static MatiereDTO toDTO(Matiere matiere) {
        return new MatiereDTO(
                matiere.getId(),
                matiere.getNom(),
                matiere.getAbreviation(),
                matiere.getEtablissement().getId()
        );
    }

    public static Matiere fromDTO(MatiereDTO matiereDTO) {
        Matiere matiere = new Matiere();
        matiere.setId(matiereDTO.id());
        matiere.setNom(matiereDTO.nom());
        matiere.setAbreviation(matiereDTO.abreviation());
        matiere.getEtablissement().setId(matiereDTO.idEtablissement());
        return matiere;
    }
}
