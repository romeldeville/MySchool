package myschool.etablissement;

import myschool.anneescolaire.AnneeScolaireRepository;
import myschool.api.ApiReponse;
import myschool.api.ApiService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EtablissementService implements ApiService<EtablissementDTO, Long> {
    private EtablissementRepository etablissementRepository;
    private AnneeScolaireRepository anneeScolaireRepository;

    public EtablissementService(EtablissementRepository etablissementRepository, AnneeScolaireRepository anneeScolaireRepository) {
        this.etablissementRepository = etablissementRepository;
        this.anneeScolaireRepository = anneeScolaireRepository;
    }

    @Override
    public ApiReponse save(EtablissementDTO etablissementDTO) {
        if(etablissementRepository.existsByNom(etablissementDTO.nom())
                || etablissementRepository.existsByNomAnlais(etablissementDTO.nomAnlais())
                || etablissementRepository.existsByAbreviation(etablissementDTO.abreviation())
                || etablissementRepository.existsByAbreviationAnlais(etablissementDTO.abreviationAnlais())
        ){
            return new ApiReponse<>("Un établissement avec ce nom ou cette abréviation existe déjà", null);
        }
        Etablissement etablissement = EtablissementMapper.fromDTO(etablissementDTO);
        System.err.println(etablissement.toString());
        Etablissement savedEtablissement = etablissementRepository.save(etablissement);
        EtablissementDTO returnedEtablissementDTO = EtablissementMapper.toDTO(savedEtablissement);
        return new ApiReponse<>("Etablissement enregistré avec succès", returnedEtablissementDTO);
    }

    @Override
    public ApiReponse findById(Long id) {
        Etablissement etablissement = etablissementRepository.findById(id).orElse(null);
        if(etablissement != null){
            EtablissementDTO etablissementDTO = EtablissementMapper.toDTO(etablissement);
            return new ApiReponse<>("Etalisseement trouvé", etablissementDTO);
        }
        return new ApiReponse<>("Etalisseement non trouvé pour l'ID : ", null);
    }

    @Override
    public ApiReponse findAll() {
        List<EtablissementDTO> etablissementDTOList = etablissementRepository.findAll()
                .stream().map(EtablissementMapper::toDTO).collect(Collectors.toList());
        return new ApiReponse<>("'"+etablissementDTOList.size()+"' établissement(s) trouvé(s)", etablissementDTOList);
    }

    @Override
    public ApiReponse update(Long id, EtablissementDTO etablissementDTO) {
        Etablissement etablissement = etablissementRepository.findById(id).orElse(null);
        if(etablissement != null){
            etablissement.setPays(etablissementDTO.pays());
            etablissement.setDevisePays(etablissementDTO.devisePays());
            etablissement.setMinistere(etablissementDTO.ministere());
            etablissement.setDelegationRegionale(etablissementDTO.delegationRegionale());
            etablissement.setDelegationDepartementale(etablissementDTO.delegationDepartementale());
            etablissement.setArrondissement(etablissementDTO.arrondissement());
            etablissement.setVilleVillage(etablissementDTO.villeVillage());
            etablissement.setLocalisation(etablissementDTO.localisation());
            etablissement.setNom(etablissementDTO.nom());
            etablissement.setAbreviation(etablissementDTO.abreviation());
            etablissement.setDeviseEtablissement(etablissementDTO.deviseEtablissement());
            etablissement.setPaysAnlais(etablissementDTO.paysAnlais());
            etablissement.setDevisePaysAnlais(etablissementDTO.devisePaysAnlais());
            etablissement.setMinistereAnlais(etablissementDTO.ministereAnlais());
            etablissement.setDelegationRegionaleAnlais(etablissementDTO.delegationRegionaleAnlais());
            etablissement.setDelegationDepartementaleAnlais(etablissementDTO.delegationDepartementaleAnlais());
            etablissement.setArrondissementAnlais(etablissementDTO.arrondissementAnlais());
            etablissement.setVilleVillageAnlais(etablissementDTO.villeVillageAnlais());
            etablissement.setLocalisationAnlais(etablissementDTO.localisationAnlais());
            etablissement.setNomAnlais(etablissementDTO.nomAnlais());
            etablissement.setAbreviationAnlais(etablissementDTO.abreviationAnlais());
            etablissement.setDeviseEtablissementAnlais(etablissementDTO.deviseEtablissementAnlais());
            etablissement.setTelephone(etablissementDTO.telephone());
            etablissement.setBoitePostale(etablissementDTO.boitePostale());
            etablissement.setFax(etablissementDTO.fax());
            etablissement.setImmatriculation(etablissementDTO.immatriculation());
            etablissement.setEmail(etablissementDTO.email());
            etablissement.setDateCreation(etablissementDTO.dateCreation());
            etablissement.setLogo(etablissementDTO.logo());
            etablissement.setAnneeScolaire(anneeScolaireRepository.findById(etablissementDTO.idAnneeScolaire()).get());

            Etablissement savedEtablissement = etablissementRepository.save(etablissement);
            EtablissementDTO returnedEtablissementDTO = EtablissementMapper.toDTO(savedEtablissement);

            return new ApiReponse<>("Etablissement modifié avec succès", returnedEtablissementDTO);
        }
        return new ApiReponse<>("Etablissement non trouvé pour l'ID : "+id, null);
    }

    @Override
    public ApiReponse delete(Long id) {
        Etablissement etablissement = etablissementRepository.findById(id).orElse(null);
        if(etablissement != null){
            etablissementRepository.deleteById(id);
            EtablissementDTO etablissementDTO = EtablissementMapper.toDTO(etablissement);
            return new ApiReponse<>("Etablissement supprimé avec succès", etablissementDTO);
        }
        return new ApiReponse<>("Etablissement non trouvé pour l'ID : "+id, null);
    }
}
