package myschool.etablissement;

import myschool.api.ApiController;
import myschool.api.ApiReponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("etablissements")
public class EtablissementController implements ApiController<EtablissementDTO, Long> {
    private EtablissementService etablissementService;

    public EtablissementController(EtablissementService etablissementService) {
        this.etablissementService = etablissementService;
    }

    @PostMapping
    @Override
    public ResponseEntity<ApiReponse> save(@RequestBody EtablissementDTO etablissementDTO) {
        ApiReponse apiReponse = etablissementService.save(etablissementDTO);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.FOUND);
    }

    @GetMapping("{id}")
    @Override
    public ResponseEntity<ApiReponse> findById(@PathVariable Long id) {
        ApiReponse apiReponse = etablissementService.findById(id);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.NOT_FOUND);
    }

    @GetMapping
    @Override
    public ResponseEntity<ApiReponse> findAll() {
        return new ResponseEntity<>(etablissementService.findAll(), HttpStatus.OK);
    }

    @PutMapping("{id}")
    @Override
    public ResponseEntity<ApiReponse> update(@PathVariable Long id, @RequestBody EtablissementDTO etablissementDTO) {
        ApiReponse apiReponse = etablissementService.update(id, etablissementDTO);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("{id}")
    @Override
    public ResponseEntity<ApiReponse> delete(@PathVariable Long id) {
        ApiReponse apiReponse = etablissementService.delete(id);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.NOT_FOUND);
    }
}
