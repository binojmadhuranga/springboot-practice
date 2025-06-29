package lk.acpt.demo.afsd.controller;


import lk.acpt.demo.afsd.dto.CustomerDto;
import lk.acpt.demo.afsd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/v1/customers")
@RestController
public class CustomerController {

    CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping
    public void saveCustomer(@RequestBody CustomerDto customerDto) {
        CustomerDto savedCustomer = customerService.saveCustomer(customerDto);

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
