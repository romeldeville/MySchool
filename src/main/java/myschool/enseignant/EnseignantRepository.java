package myschool.enseignant;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
    public Boolean existsByNomAndPrenom(String nom, String prenom);
}
