package myschool.classe;

public record ClasseDTO(
        Long id,
        String nom,
        Long idNiveau,
        Long idProfesseurPrincipal
) {
}
