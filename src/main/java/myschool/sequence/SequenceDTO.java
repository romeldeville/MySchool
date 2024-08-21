package myschool.sequence;

public record SequenceDTO(
        Long id,
        String nom,
        String nomAnglais,
        String abreviation,
        String abreviationAnglais,
        Long idTrimestre
) {
}
