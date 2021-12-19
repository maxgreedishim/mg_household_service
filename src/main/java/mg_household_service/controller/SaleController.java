package mg_household_service.controller;
import mg_household_service.entity.Sale;
import mg_household_service.entity.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SaleController {
    @Autowired
    SaleRepository saleRepository;

    @PostMapping("/sale")
    public ResponseEntity <Sale> addCustomer(@RequestBody Sale sale){
        try {
            Sale _sale = new Sale();
            _sale.setEndDate(sale.getEndDate());
            _sale.setNotes(sale.getNotes());
            _sale.setPrice(sale.getPrice());
            _sale.setStartDate(sale.getStartDate());
            _sale = saleRepository.save(_sale);
            return new ResponseEntity<>(_sale, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
