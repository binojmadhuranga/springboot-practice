package lk.acpt.demo.afsd.controller;


import lk.acpt.demo.afsd.dto.CustomerDto;
import lk.acpt.demo.afsd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@RequestMapping("/api/v1/customers")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping
    public ResponseEntity<CustomerDto> saveCustomer(@RequestBody CustomerDto customerDto) {
        CustomerDto result = customerService.saveCustomer(customerDto);
        return new ResponseEntity<>(result, HttpStatus.CREATED);

    }



    @GetMapping
    public ResponseEntity<List<CustomerDto>> getAllCustomer() {

        List<CustomerDto> allCustomers = customerService.getAllCustomers();
        return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.OK);

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCustomer(@PathVariable("id") int id) {
        CustomerDto result = customerService.deleteCustomer(id);
        if (result != null) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            HashMap<String,Object> map = new HashMap<>();
            map.put("status"," HttpStatus.NOT_FOUND");
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }

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
