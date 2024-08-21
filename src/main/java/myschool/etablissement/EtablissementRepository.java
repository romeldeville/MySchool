package myschool.etablissement;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {
    Boolean existsByNom(String nom);
    Boolean existsByNomAnlais(String nomAnglais);
    Boolean existsByAbreviation(String abreviation);
    Boolean existsByAbreviationAnlais(String abreviationAnglais);
}
