package myschool.enseignant;

import myschool.api.ApiReponse;
import myschool.api.ApiService;
import myschool.etablissement.EtablissementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnseignantService implements ApiService<EnseignantDTO, Long> {
    private EnseignantRepository enseignantRepository;
    private EtablissementRepository etablissementRepository;

    public EnseignantService(EnseignantRepository enseignantRepository, EtablissementRepository etablissementRepository) {
        this.enseignantRepository = enseignantRepository;
        this.etablissementRepository = etablissementRepository;
    }

    @Override
    public ApiReponse save(EnseignantDTO enseignantDTO) {
        if(enseignantRepository.existsByNomAndPrenom(enseignantDTO.nom(), enseignantDTO.prenom())) {
            return new ApiReponse<>("L'enseignant '"+enseignantDTO.nom()+" "+enseignantDTO.prenom()+"' existe déjà", null);
        }
        Enseignant enseignant = EnseignantMapper.fromDTO(enseignantDTO);
        Enseignant savedEnseignant = enseignantRepository.save(enseignant);
        EnseignantDTO returnedEnseignantDTO = EnseignantMapper.toDTO(savedEnseignant);
        return new ApiReponse<>("Enseignant enregistré avec succès", returnedEnseignantDTO);
    }

    @Override
    public ApiReponse findById(Long id) {
        Enseignant enseignant = enseignantRepository.findById(id).orElse(null);
        if(enseignant != null){
            EnseignantDTO enseignantDTO = EnseignantMapper.toDTO(enseignant);
            return new ApiReponse<>("Enseignant trouvé", enseignantDTO);
        }
        return new ApiReponse<>("Enseignant non trouvé pour l'ID : "+id, null);
    }

    @Override
    public ApiReponse findAll() {
        List<EnseignantDTO> enseignantDTOList = enseignantRepository.findAll()
                .stream().map(EnseignantMapper::toDTO).collect(Collectors.toList());
        return new ApiReponse<>("'"+enseignantDTOList.size()+"' Enseignant(s) trouvée(s)", enseignantDTOList);
    }

    @Override
    public ApiReponse update(Long id, EnseignantDTO enseignantDTO) {
        Enseignant enseignant = enseignantRepository.findById(id).orElse(null);
        if(enseignant != null){
            enseignant.setNom(enseignantDTO.nom());
            enseignant.setPrenom(enseignantDTO.prenom());
            enseignant.setSexe(enseignantDTO.sexe());
            enseignant.setTelephone(enseignantDTO.telephone());
            enseignant.setDiplome(enseignantDTO.diplome());
            enseignant.setSpecialite(enseignantDTO.specialite());
            enseignant.setGrade(enseignantDTO.grade());
            enseignant.setFonction(enseignantDTO.fonction());
            enseignant.setStatut(enseignantDTO.statut());
            enseignant.setDateArrivee(enseignantDTO.dateArrivee());
            enseignant.setMotifArrivee(enseignantDTO.motifArrivee());
            enseignant.setMatricule(enseignantDTO.matricule());
            enseignant.setPseudonyme(enseignantDTO.pseudonyme());
            enseignant.setMotDePasse(enseignantDTO.motDePasse());
            enseignant.setEtablissement(etablissementRepository.findById(enseignantDTO.idEtablissement()).get());

            Enseignant savedEnseignant = enseignantRepository.save(enseignant);
            EnseignantDTO returnedEnseignantDTO = EnseignantMapper.toDTO(savedEnseignant);

            return new ApiReponse<>("Enseignant modifiée avec succès", returnedEnseignantDTO);
        }
        return new ApiReponse<>("Enseignant non trouvé pour l'ID : "+id, null);
    }

    @Override
    public ApiReponse delete(Long id) {
        Enseignant enseignant = enseignantRepository.findById(id).orElse(null);
        if(enseignant != null){
            enseignantRepository.deleteById(id);
            EnseignantDTO enseignantDTO = EnseignantMapper.toDTO(enseignant);
            return new ApiReponse<>("Enseinant supprimé avec succès", enseignantDTO);
        }
        return new ApiReponse<>("Enseignant non trouvé pour l'ID : "+id, null);
    }
}
