package myschool.section;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
    public Boolean existsByNomAndAbreviationAndEtablissementId(String nom, String abreviation, Long idEtablissement);
}
