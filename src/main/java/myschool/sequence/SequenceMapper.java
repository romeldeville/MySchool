package myschool.sequence;

public class SequenceMapper {
    public static SequenceDTO toDTO(Sequence sequence) {
        return new SequenceDTO(
                sequence.getId(),
                sequence.getNom(),
                sequence.getNomAnglais(),
                sequence.getAbreviation(),
                sequence.getAbreviationAnglais(),
                sequence.getTrimestre().getId()
        );
    }

    public static Sequence fromDTO(SequenceDTO sequenceDTO) {
        Sequence sequence = new Sequence();
        sequence.setId(sequenceDTO.id());
        sequence.setNom(sequenceDTO.nom());
        sequence.setNomAnglais(sequenceDTO.nomAnglais());
        sequence.setAbreviation(sequenceDTO.abreviation());
        sequence.setAbreviationAnglais(sequenceDTO.abreviationAnglais());
        sequence.getTrimestre().setId(sequenceDTO.idTrimestre());
        return sequence;
    }
}
