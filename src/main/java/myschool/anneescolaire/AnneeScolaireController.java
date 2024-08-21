package myschool.anneescolaire;

import myschool.api.ApiController;
import myschool.api.ApiReponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("anneescolaires")
public class AnneeScolaireController implements ApiController<AnneeScolaireDTO, Long> {
    private AnneeScolaireService anneeScolaireService;

    public AnneeScolaireController(AnneeScolaireService anneeScolaireService) {
        this.anneeScolaireService = anneeScolaireService;
    }

    @PostMapping
    @Override
    public ResponseEntity<ApiReponse> save(@RequestBody AnneeScolaireDTO anneeScolaireDTO) {
        ApiReponse apiReponse = anneeScolaireService.save(anneeScolaireDTO);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.FOUND);
    }

    @GetMapping("{id}")
    @Override
    public ResponseEntity<ApiReponse> findById(@PathVariable Long id) {
        ApiReponse apiReponse = anneeScolaireService.findById(id);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.NOT_FOUND);
    }

    @GetMapping
    @Override
    public ResponseEntity<ApiReponse> findAll() {
        return new ResponseEntity<>(anneeScolaireService.findAll(), HttpStatus.OK);
    }

    @PutMapping("{id}")
    @Override
    public ResponseEntity<ApiReponse> update(@PathVariable Long id, @RequestBody AnneeScolaireDTO anneeScolaireDTO) {
        ApiReponse apiReponse = anneeScolaireService.update(id, anneeScolaireDTO);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("{id}")
    @Override
    public ResponseEntity<ApiReponse> delete(@PathVariable Long id) {
        ApiReponse apiReponse = anneeScolaireService.delete(id);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.NOT_FOUND);
    }
}
