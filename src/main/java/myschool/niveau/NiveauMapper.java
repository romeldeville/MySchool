package myschool.niveau;

public class NiveauMapper {
    public static NiveauDTO toDTO(Niveau niveau) {
        return new NiveauDTO(
                niveau.getId(),
                niveau.getNom(),
                niveau.getMoyenneDePassage(),
                niveau.getExamen(),
                niveau.getSection().getId()
        );
    }

    public static Niveau fromDTO(NiveauDTO niveauDTO) {
        Niveau niveau = new Niveau();
        niveau.setId(niveauDTO.id());
        niveau.setNom(niveauDTO.nom());
        niveau.setMoyenneDePassage(niveauDTO.moyenneDePassage());
        niveau.setExamen(niveauDTO.examen());
        niveau.getSection().setId(niveauDTO.idSection());
        return niveau;
    }
}
