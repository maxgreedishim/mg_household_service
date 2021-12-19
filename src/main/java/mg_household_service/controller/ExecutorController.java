package mg_household_service.controller;
import mg_household_service.entity.Executor;
import mg_household_service.entity.ExecutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ExecutorController {
    @Autowired
    ExecutorRepository executorRepository;

    @PostMapping("/executor")
    public ResponseEntity <Executor> addCustomer(@RequestBody Executor executor){
        try {
            Executor _executor = new Executor();
            _executor.setFirstName(executor.getFirstName());
            _executor.setLastName(executor.getLastName());
            _executor.setPhoneNumber(executor.getPhoneNumber());
            _executor = executorRepository.save(_executor);
            return new ResponseEntity<>(_executor, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
