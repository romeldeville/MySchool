package myschool.anneescolaire;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnneeScolaireRepository extends JpaRepository<AnneeScolaire, Long> {
    public Boolean existsByNom(String nom);
}
