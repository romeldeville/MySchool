package myschool.enseignant;

import myschool.api.ApiController;
import myschool.api.ApiReponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("enseignants")
public class EnseignantController implements ApiController<EnseignantDTO, Long> {
    private EnseignantService enseignantService;

    public EnseignantController(EnseignantService enseignantService) {
        this.enseignantService = enseignantService;
    }

    @PostMapping
    @Override
    public ResponseEntity<ApiReponse> save(@RequestBody EnseignantDTO enseignantDTO) {
        try {
            ApiReponse apiReponse = enseignantService.save(enseignantDTO);
            if (apiReponse.data() != null) {
                return new ResponseEntity<>(apiReponse, HttpStatus.OK);
            }
            return new ResponseEntity<>(apiReponse, HttpStatus.FOUND);
        }catch (Exception e){
            return new ResponseEntity<>(
                    new ApiReponse<>("Valeur idAnneeScolaire incorrecte", null),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("{id}")
    @Override
    public ResponseEntity<ApiReponse> findById(@PathVariable Long id) {
        ApiReponse apiReponse = enseignantService.findById(id);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.NOT_FOUND);
    }

    @GetMapping
    @Override
    public ResponseEntity<ApiReponse> findAll() {
        return new ResponseEntity<>(enseignantService.findAll(), HttpStatus.OK);
    }

    @PutMapping("{id}")
    @Override
    public ResponseEntity<ApiReponse> update(@PathVariable Long id, @RequestBody EnseignantDTO enseignantDTO) {
        ApiReponse apiReponse = enseignantService.update(id, enseignantDTO);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("{id}")
    @Override
    public ResponseEntity<ApiReponse> delete(@PathVariable Long id) {
        ApiReponse apiReponse = enseignantService.delete(id);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.NOT_FOUND);
    }
}
