package myschool.classe;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClasseRepository extends JpaRepository<Classe, Long> {
    public Boolean existsByNom(String nom);
}
