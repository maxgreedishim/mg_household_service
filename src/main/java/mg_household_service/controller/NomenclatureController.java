package mg_household_service.controller;
import mg_household_service.entity.Nomenclature;
import mg_household_service.entity.NomenclatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NomenclatureController {
    @Autowired
    NomenclatureRepository nomenclatureRepository;

    @PostMapping("/nomenclature")
    public ResponseEntity <Nomenclature> addCustomer(@RequestBody Nomenclature nomenclature){
        try {
            Nomenclature _nomenclature = new Nomenclature();
            _nomenclature.setName(nomenclature.getName());
            _nomenclature = nomenclatureRepository.save(_nomenclature);
            return new ResponseEntity<>(_nomenclature, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
