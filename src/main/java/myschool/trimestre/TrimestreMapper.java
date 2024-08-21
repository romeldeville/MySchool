package myschool.trimestre;

public class TrimestreMapper {
    public static TrimestreDTO toDTO(Trimestre trimestre) {
        return new TrimestreDTO(
                trimestre.getId(),
                trimestre.getNom(),
                trimestre.getNomAnglais(),
                trimestre.getAbreviation(),
                trimestre.getAbreviationAnglais()
        );
    }

    public static Trimestre fromDTO(TrimestreDTO trimestreDTO) {
        return new Trimestre(
                trimestreDTO.id(),
                trimestreDTO.nom(),
                trimestreDTO.nomAnglais(),
                trimestreDTO.abreviation(),
                trimestreDTO.abreviationAnglais()
        );
    }
}
