package mg_household_service.controller;

import mg_household_service.entity.Customer;
import mg_household_service.entity.CustomerRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/customer")
    public ResponseEntity <Customer> addCustomer(@RequestBody Customer customer){
        try {
            Customer _customer = new Customer();
            _customer.setFirstName(customer.getFirstName());
            _customer.setLastName(customer.getLastName());
            _customer.setMiddleName(customer.getMiddleName());
            _customer.setPhoneNumber(customer.getPhoneNumber());
            _customer = customerRepository.save(_customer);
            return new ResponseEntity<>(_customer, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
