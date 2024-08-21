package myschool.cycle;

import myschool.api.ApiController;
import myschool.api.ApiReponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cycles")
public class CycleController implements ApiController<CycleDTO, Long> {
    private final CycleService cycleService;

    public CycleController(CycleService cycleService) {
        this.cycleService = cycleService;
    }

    @PostMapping
    @Override
    public ResponseEntity<ApiReponse> save(@RequestBody CycleDTO cycleDTO) {
        ApiReponse apiReponse = cycleService.save(cycleDTO);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.FOUND);
    }

    @GetMapping("{id}")
    @Override
    public ResponseEntity<ApiReponse> findById(@PathVariable Long id) {
        ApiReponse apiReponse = cycleService.findById(id);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.NOT_FOUND);
    }

    @GetMapping
    @Override
    public ResponseEntity<ApiReponse> findAll() {
        return new ResponseEntity<>(cycleService.findAll(), HttpStatus.OK);
    }

    @PutMapping("{id}")
    @Override
    public ResponseEntity<ApiReponse> update(@PathVariable Long id, @RequestBody CycleDTO cycleDTO) {
        ApiReponse apiReponse = cycleService.update(id, cycleDTO);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("{id}")
    @Override
    public ResponseEntity<ApiReponse> delete(@PathVariable Long id) {
        ApiReponse apiReponse = cycleService.delete(id);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.NOT_FOUND);
    }
}
