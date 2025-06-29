package lk.acpt.demo.afsd.service.impl;

import lk.acpt.demo.afsd.dto.CustomerDto;
import lk.acpt.demo.afsd.entity.Customer;
import lk.acpt.demo.afsd.repo.CustomerRepo;
import lk.acpt.demo.afsd.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CustomerServiceIMPL implements CustomerService {


    CustomerRepo repo;

    public CustomerServiceIMPL(CustomerRepo repo) {
        this.repo = repo;
    }


    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        Customer save = repo.save(new Customer(null, customerDto.getName(), customerDto.getSalary(), customerDto.getEmail()));

        return new CustomerDto(save.getId(), save.getName(), save.getSalary(), save.getEmail());

    }


    @Override
    public CustomerDto updateCustomer(CustomerDto customerDTO) {
        return null;
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        return List.of();
    }

    @Override
    public CustomerDto deleteCustomer(int id) {
        return null;
    }

    @Override
    public CustomerDto getCustomerById(int id) {
        return null;
    }

    @Override
    public CustomerDto getCustomerByEmail(String email) {
        return null;
    }
}
