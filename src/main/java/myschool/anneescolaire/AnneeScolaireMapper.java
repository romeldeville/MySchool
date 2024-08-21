package myschool.anneescolaire;

public class AnneeScolaireMapper {
    public static AnneeScolaireDTO toDTO(AnneeScolaire anneeScolaire) {
        return new AnneeScolaireDTO(
                anneeScolaire.getId(),
                anneeScolaire.getNom()
        );
    }

    public static AnneeScolaire fromDTO(AnneeScolaireDTO anneeScolaireDTO) {
        AnneeScolaire anneeScolaire = new AnneeScolaire();
        anneeScolaire.setId(anneeScolaireDTO.id());
            anneeScolaire.setNom(anneeScolaireDTO.nom());
        return anneeScolaire;
    }
}
