package myschool.cycle;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CycleRepository extends JpaRepository<Cycle, Long> {
    public Boolean existsByNomAndAbreviationAndSectionId(String nom, String abreviation, Long idSection);
}
