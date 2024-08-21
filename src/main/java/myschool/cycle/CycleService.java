package myschool.cycle;

import myschool.api.ApiReponse;
import myschool.api.ApiService;
import myschool.section.SectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CycleService implements ApiService<CycleDTO, Long> {
    private final CycleRepository cycleRepository;
    private final SectionRepository sectionRepository;

    public CycleService(CycleRepository cycleRepository, SectionRepository sectionRepository) {
        this.cycleRepository = cycleRepository;
        this.sectionRepository = sectionRepository;
    }

    @Override
    public ApiReponse save(CycleDTO cycleDTO) {
        if(cycleRepository.existsByNomAndAbreviationAndSectionId(cycleDTO.nom(), cycleDTO.abreviation(), cycleDTO.idSection())){
            return new ApiReponse<>("Le cycle '"+cycleDTO.nom()+"' existe déjà", null);
        }
        Cycle cycle = CycleMapper.fromDTO(cycleDTO);
        Cycle savedCycle = cycleRepository.save(cycle);
        CycleDTO retunedCycleDTO = CycleMapper.toDTO(savedCycle);
        return new ApiReponse<>("Cycle enregistré avec succès", retunedCycleDTO);
    }

    @Override
    public ApiReponse findById(Long id) {
        Cycle cycle = cycleRepository.findById(id).orElse(null);
        if(cycle != null){
            CycleDTO cycleDTO = CycleMapper.toDTO(cycle);
            return new ApiReponse<>("Cyle trouvé", cycleDTO);
        }
        return new ApiReponse<>("Cyle non trouvé pour l'ID : "+id, null);
    }

    @Override
    public ApiReponse findAll() {
        List<CycleDTO> cycleDTOList = cycleRepository.findAll()
                .stream().map(CycleMapper::toDTO)
                .collect(Collectors.toList());
        return new ApiReponse<>("'"+cycleDTOList.size()+"' Cyle(s) trouvé(s)", cycleDTOList);
    }

    @Override
    public ApiReponse update(Long id, CycleDTO cycleDTO) {
        Cycle cycle = cycleRepository.findById(id).orElse(null);
        if(cycle != null){
            cycle.setNom(cycleDTO.nom());
            cycle.setAbreviation(cycleDTO.abreviation());
            cycle.setSection(sectionRepository.findById(cycleDTO.idSection()).get());

            Cycle savedCycle = cycleRepository.save(cycle);
            CycleDTO retunedCycleDTO = CycleMapper.toDTO(savedCycle);
            return new ApiReponse<>("Cycle modifié avec succès", retunedCycleDTO);
        }
        return new ApiReponse<>("Cycle non trouvé pour l'ID : "+id, null);
    }

    @Override
    public ApiReponse delete(Long id) {
        Cycle cycle = cycleRepository.findById(id).orElse(null);
        if(cycle != null){
            cycleRepository.deleteById(id);
            CycleDTO retunedCycleDTO = CycleMapper.toDTO(cycle);
            return new ApiReponse<>("Cycle supprimé avec succès", retunedCycleDTO);
        }
        return new ApiReponse<>("Cycle non trouvé pour l'ID : "+id, null);
    }
}
