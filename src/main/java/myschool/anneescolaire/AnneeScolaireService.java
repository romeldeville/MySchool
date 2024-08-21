package myschool.anneescolaire;

import myschool.api.ApiReponse;
import myschool.api.ApiService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnneeScolaireService implements ApiService<AnneeScolaireDTO, Long>{
    private AnneeScolaireRepository anneeScolaireRepository;

    public AnneeScolaireService(AnneeScolaireRepository anneeScolaireRepository) {
        this.anneeScolaireRepository = anneeScolaireRepository;
    }

    @Override
    public ApiReponse save(AnneeScolaireDTO anneeScolaireDTO) {
        if (anneeScolaireRepository.existsByNom(anneeScolaireDTO.nom())){
            return new ApiReponse<>("L'année scolaire '"+anneeScolaireDTO.nom()+"' existe déjà !", null);
        }
        AnneeScolaire anneeScolaire = AnneeScolaireMapper.fromDTO(anneeScolaireDTO);
        AnneeScolaire savedAnneeScolaire = anneeScolaireRepository.save(anneeScolaire);
        AnneeScolaireDTO returnedAnneeScolaireDTO = AnneeScolaireMapper.toDTO(savedAnneeScolaire);
        return new ApiReponse<>("Année scolaire enregistrée avec succès", returnedAnneeScolaireDTO);
    }

    @Override
    public ApiReponse findById(Long id) {
        AnneeScolaire anneeScolaire = anneeScolaireRepository.findById(id).orElse(null);
        if(anneeScolaire != null){
            AnneeScolaireDTO returnedAnneeScolaireDTO = AnneeScolaireMapper.toDTO(anneeScolaire);
            return new ApiReponse<>("Année scolaire trouvée", returnedAnneeScolaireDTO);
        }
        return new ApiReponse<>("Année scolaire non trouvée pour l'ID : "+id, null);
    }

    @Override
    public ApiReponse findAll() {
        List<AnneeScolaireDTO> anneeScolaireDTOList = anneeScolaireRepository.findAll()
                .stream().map(AnneeScolaireMapper::toDTO).collect(Collectors.toList());
        return new ApiReponse<>("'"+anneeScolaireDTOList.size()+"' Année(s) scolaire(s) trouvée(s)!", anneeScolaireDTOList);
    }

    @Override
    public ApiReponse update(Long id, AnneeScolaireDTO anneeScolaireDTO) {
        AnneeScolaire anneeScolaire = anneeScolaireRepository.findById(id).orElse(null);
        if(anneeScolaire != null){
            anneeScolaire.setNom(anneeScolaireDTO.nom());
            AnneeScolaire updatedAnneeScolaire = anneeScolaireRepository.save(anneeScolaire);
            AnneeScolaireDTO returnedAnneeScolaireDTO = AnneeScolaireMapper.toDTO(updatedAnneeScolaire);
            return new ApiReponse<>("Année scolaire trouvée", returnedAnneeScolaireDTO);
        }
        return new ApiReponse<>("Année scolaire non trouvée pour l'ID : "+id, null);
    }

    @Override
    public ApiReponse delete(Long id) {
        AnneeScolaire anneeScolaire = anneeScolaireRepository.findById(id).orElse(null);
        if(anneeScolaire != null){
            AnneeScolaireDTO returnedAnneeScolaireDTO = AnneeScolaireMapper.toDTO(anneeScolaire);
            anneeScolaireRepository.deleteById(id);
            return new ApiReponse<>("Année scolaire supprimée", returnedAnneeScolaireDTO);
        }
        return new ApiReponse<>("Année scolaire non trouvée pour l'ID : "+id, null);
    }
}
