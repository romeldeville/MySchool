package myschool.eleve;

import java.util.Date;

public record EleveDTO(
        Long id,
        String nom,
        String prenom,
        Date dateDeNaissance,
        String lieuDeNaissance,
        String sexe,
        String nomDuPere,
        String nomDeLaMere,
        String nomDuTuteur,
        String matricule,
        Long idClasse,
        Boolean redouble,
        String telephone
) {
}
