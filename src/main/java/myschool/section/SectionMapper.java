package myschool.section;

public class SectionMapper {
    public static SectionDTO toDTO(Section section) {
        return new SectionDTO(
                section.getId(),
                section.getNom(),
                section.getAbreviation(),
                section.getEtablissement().getId()
        );
    }

    public static Section fromDTO(SectionDTO sectionDTO) {
        Section section = new Section();
        section.setId(sectionDTO.id());
        section.setNom(sectionDTO.nom());
        section.setAbreviation(sectionDTO.abreviation());
        section.getEtablissement().setId(sectionDTO.idEtablissement());
        return section;
    }

}
