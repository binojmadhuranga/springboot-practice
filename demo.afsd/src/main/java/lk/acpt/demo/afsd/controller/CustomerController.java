package lk.acpt.demo.afsd.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/v1/customers")
@RestController
public class CustomerController {

    @PostMapping
    public void saveCustomer() {

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
