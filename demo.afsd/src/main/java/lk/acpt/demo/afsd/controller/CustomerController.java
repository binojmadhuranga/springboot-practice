package lk.acpt.demo.afsd.controller;


import lk.acpt.demo.afsd.dto.CustomerDto;
import lk.acpt.demo.afsd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/v1/customers")
@RestController
public class CustomerController {

  private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping
    public  ResponseEntity<CustomerDto> saveCustomer(@RequestBody CustomerDto customerDto) {
        CustomerDto result = customerService.saveCustomer(customerDto);
        return new ResponseEntity<>(result, HttpStatus.CREATED);

    }

    @GetMapping
    public void getAllCustomer() {

    }

    @DeleteMapping
    public void deleteCustomer() {

    }

    @PutMapping
    public void updateCustomer() {

    }

    @GetMapping("/{id}")
    public void getCustomerById() {

    }

    @GetMapping("/get_customer_by_id/{email}")
    public void getCustomerByEmail() {

    }


}
