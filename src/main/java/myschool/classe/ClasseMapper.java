package myschool.classe;

public class ClasseMapper {
    public static ClasseDTO toDTO(Classe classe) {
        return new ClasseDTO(
                classe.getId(),
                classe.getNom(),
                classe.getNiveau().getId(),
                classe.getProfesseurPrincipal().getId()
        );
    }

    public static Classe fromDTO(ClasseDTO classeDTO) {
        Classe classe = new Classe();
        classe.setId(classeDTO.id());
        classe.setNom(classeDTO.nom());
        classe.getNiveau().setId(classeDTO.idNiveau());
        classe.getProfesseurPrincipal().setId(classeDTO.idProfesseurPrincipal());
        return classe;
    }
}
