package lk.acpt.demo.afsd.controller;

import lk.acpt.demo.afsd.dto.CustomerDto;
import lk.acpt.demo.afsd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
            HashMap<String, Object> map = new HashMap<>();
            map.put("status", " HttpStatus.NOT_FOUND");
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateCustomer(@RequestBody CustomerDto customerDto, @PathVariable("id") int id) {

        //CustomerDto customerDto = new CustomerDto();

        customerDto.setId(id);
        CustomerDto result = customerService.updateCustomer(customerDto);

        if (result != null) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            HashMap<String, Object> map = new HashMap<>();
            map.put("status", " HttpStatus.NOT_FOUND");
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }


    }


    @GetMapping("/{id}")
    public  ResponseEntity<Object> getCustomerById(@PathVariable("id") int id) {

        CustomerDto customerDto = customerService.getCustomerById(id);
        if (customerDto != null) {
            return new ResponseEntity<>(customerDto, HttpStatus.OK);
        } else {
            HashMap<String, Object> map = new HashMap<>();
            map.put("status", " HttpStatus.NOT_FOUND");
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }

    }



    @GetMapping("/get_customer_by_email/{email}")

    public ResponseEntity<Object> getCustomerByEmail(@PathVariable("email") String email) {

        CustomerDto customerDto = customerService.getCustomerByEmail(email);
        if (customerDto != null) {
            return new ResponseEntity<>(customerDto, HttpStatus.OK);

        } else {
            HashMap<String, Object> map = new HashMap<>();
            map.put("status", " HttpStatus.NOT_FOUND");
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }



    }


}
