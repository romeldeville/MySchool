package myschool.classe;

import myschool.api.ApiReponse;
import myschool.api.ApiService;

import java.util.List;
import java.util.stream.Collectors;

public class ClasseService implements ApiService<ClasseDTO, Long> {
    private ClasseRepository classeRepository;

    public ClasseService(ClasseRepository classeRepository) {
        this.classeRepository = classeRepository;
    }

    @Override
    public ApiReponse save(ClasseDTO classeDTO) {
        if(classeRepository.existsByNom(classeDTO.nom())){
            return new ApiReponse<>("La classe '"+classeDTO.nom()+"' existe déjà !", null);
        }
        Classe classe = ClasseMapper.fromDTO(classeDTO);
        Classe savedClasse = classeRepository.save(classe);
        ClasseDTO returnedClasseDTO = ClasseMapper.toDTO(savedClasse);
        return new ApiReponse<>("Classe : '"+classeDTO.nom()+"' enregistrée avec succès", returnedClasseDTO);
    }

    @Override
    public ApiReponse findById(Long id) {
        Classe classe = classeRepository.findById(id).orElse(null);
        if(classe != null){
            ClasseDTO classeDTO = ClasseMapper.toDTO(classe);
            return new ApiReponse<>("Classe trouvée", classeDTO);
        }
        return new ApiReponse<>("Classe non trouvée pour l'ID : "+id, null);
    }

    @Override
    public ApiReponse findAll() {
        List<ClasseDTO> classeDTOList = classeRepository.findAll()
                .stream().map(ClasseMapper::toDTO).collect(Collectors.toList());
        return new ApiReponse<>("'"+classeDTOList.size()+"' Classe(s) trouvée(s)", classeDTOList);
    }

    @Override
    public ApiReponse update(Long id, ClasseDTO classeDTO) {
        Classe classe = classeRepository.findById(id).orElse(null);
        if(classe != null){
            classe.setNom(classeDTO.nom());
            classe.getNiveau().setId(classeDTO.idNiveau());
            classe.getProfesseurPrincipal().setId(classeDTO.idProfesseurPrincipal());
            Classe updatedClasse = classeRepository.save(classe);
            ClasseDTO returnedClasseDTO = ClasseMapper.toDTO(updatedClasse);
            return new ApiReponse<>("Classe modifiée avec succès : ", returnedClasseDTO);
        }
        return new ApiReponse<>("Classe non trouvée pour l'ID : "+id, null);
    }

    @Override
    public ApiReponse delete(Long id) {
        Classe classe = classeRepository.findById(id).orElse(null);
        if(classe != null){
            classeRepository.deleteById(id);
            ClasseDTO returnedClasseDTO = ClasseMapper.toDTO(classe);
            return new ApiReponse<>("Classe supprimée avec succès : ", returnedClasseDTO);
        }
        return new ApiReponse<>("Classe non trouvée pour l'ID : "+id, null);
    }
}
