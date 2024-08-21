package myschool.section;

import myschool.api.ApiController;
import myschool.api.ApiReponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sections")
public class SectionController implements ApiController<SectionDTO, Long> {
    private SectionService sectionService;

    public SectionController(SectionService sectionService) {
        this.sectionService = sectionService;
    }

    @PostMapping
    @Override
    public ResponseEntity<ApiReponse> save(@RequestBody SectionDTO sectionDTO) {
        ApiReponse apiReponse = sectionService.save(sectionDTO);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.FOUND);
    }

    @GetMapping("{id}")
    @Override
    public ResponseEntity<ApiReponse> findById(@PathVariable Long id) {
        ApiReponse apiReponse = sectionService.findById(id);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.NOT_FOUND);
    }

    @GetMapping
    @Override
    public ResponseEntity<ApiReponse> findAll() {
        return new ResponseEntity<>(sectionService.findAll(), HttpStatus.OK);
    }

    @PutMapping("{id}")
    @Override
    public ResponseEntity<ApiReponse> update(@PathVariable Long id, @RequestBody SectionDTO sectionDTO) {
        ApiReponse apiReponse = sectionService.update(id, sectionDTO);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("{id}")
    @Override
    public ResponseEntity<ApiReponse> delete(@PathVariable Long id) {
        ApiReponse apiReponse = sectionService.delete(id);
        if(apiReponse.data() != null){
            return new ResponseEntity<>(apiReponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(apiReponse, HttpStatus.NOT_FOUND);
    }
}
