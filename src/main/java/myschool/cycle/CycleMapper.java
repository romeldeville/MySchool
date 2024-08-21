package myschool.cycle;

public class CycleMapper {
    public static CycleDTO toDTO(Cycle cycle) {
        return new CycleDTO(
                cycle.getId(),
                cycle.getNom(),
                cycle.getAbreviation(),
                cycle.getSection().getId()
        );
    }

    public static Cycle fromDTO(CycleDTO cycleDTO) {
        Cycle cycle = new Cycle();
        cycle.setId(cycleDTO.id());
        cycle.setNom(cycleDTO.nom());
        cycle.setAbreviation(cycleDTO.abreviation());
        cycle.getSection().setId(cycleDTO.idSection());
        return cycle;
    }
}
