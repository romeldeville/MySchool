package myschool.section;

import myschool.api.ApiReponse;
import myschool.api.ApiService;
import myschool.etablissement.EtablissementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionService implements ApiService<SectionDTO, Long> {
    private SectionRepository sectionRepository;
    private EtablissementRepository etablissementRepository;

    public SectionService(SectionRepository sectionRepository, EtablissementRepository etablissementRepository) {
        this.sectionRepository = sectionRepository;
        this.etablissementRepository = etablissementRepository;
    }

    @Override
    public ApiReponse save(SectionDTO sectionDTO) {
        if(sectionRepository.existsByNomAndAbreviationAndEtablissementId(sectionDTO.nom(), sectionDTO.abreviation(), sectionDTO.idEtablissement())){
            return new ApiReponse<>("La section '"+sectionDTO.nom()+"' Existe déjà", null);
        }
        Section section = SectionMapper.fromDTO(sectionDTO);
        Section savedSection = sectionRepository.save(section);
        SectionDTO retunedSectionDTO = SectionMapper.toDTO(savedSection);
        return new ApiReponse<>("Section enregistrée avec succès", retunedSectionDTO);
    }

    @Override
    public ApiReponse findById(Long id) {
        Section section = sectionRepository.findById(id).orElse(null);
        if(section != null){
            SectionDTO sectionDTO = SectionMapper.toDTO(section);
            return new ApiReponse<>("Section trouvée", sectionDTO);
        }
        return new ApiReponse<>("Section non trouvé pour l'ID : "+id, null);
    }

    @Override
    public ApiReponse findAll() {
        List<SectionDTO> sectionDTOList = sectionRepository.findAll()
                .stream().map(SectionMapper::toDTO)
                .toList();
        return new ApiReponse<>("'"+sectionDTOList.size()+"' Section(s) trouvée(s)", sectionDTOList);
    }

    @Override
    public ApiReponse update(Long id, SectionDTO sectionDTO) {
        Section section = sectionRepository.findById(id).orElse(null);
        if(section != null){
            section.setNom(sectionDTO.nom());
            section.setAbreviation(sectionDTO.abreviation());
            section.setEtablissement(etablissementRepository.findById(sectionDTO.idEtablissement()).get());

            Section updatedSection = sectionRepository.save(section);
            return new ApiReponse<>("Section modifiée avec succès", updatedSection);
        }
        return new ApiReponse<>("Section non trouvée pour l'ID : "+id, null);
    }

    @Override
    public ApiReponse delete(Long id) {
        Section section = sectionRepository.findById(id).orElse(null);
        if(section != null){
            sectionRepository.deleteById(id);
            SectionDTO sectionDTO = SectionMapper.toDTO(section);
            return new ApiReponse<>("Section supprimée avec succès", sectionDTO);
        }
        return new ApiReponse<>("Section non trouvée pour l'ID : "+id, null);
    }
}
