package lk.acpt.demo.afsd.service.impl;

import lk.acpt.demo.afsd.dto.CustomerDto;
import lk.acpt.demo.afsd.entity.Customer;
import lk.acpt.demo.afsd.repo.CustomerRepo;
import lk.acpt.demo.afsd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceIMPL implements CustomerService {


    CustomerRepo repo;

    @Autowired
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

        Optional<Customer> byId = repo.findById(customerDTO.getId());
        if (byId.isPresent()) {
            Customer customer = byId.get();
            customer.setName(customerDTO.getName());
            customer.setSalary(customerDTO.getSalary());
            customer.setEmail(customerDTO.getEmail());
            Customer updatedCustomer = repo.save(customer);
            return new CustomerDto(updatedCustomer.getId(), updatedCustomer.getName(), updatedCustomer.getSalary(), updatedCustomer.getEmail());

        } else {
            return null;
        }

    }


    @Override
    public List<CustomerDto> getAllCustomers() {
        List<Customer> all = repo.findAll();
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();

        for (Customer customer : all) {
            customerDtos.add(new CustomerDto(customer.getId(), customer.getName(), customer.getSalary(), customer.getEmail()));
        }

        return customerDtos;
    }


    @Override
    public CustomerDto deleteCustomer(int id) {

        Optional<Customer> byid = repo.findById(id);
        if (byid.isPresent()) {
            repo.deleteById(id);
            Customer customer = byid.get();
            return new CustomerDto(customer.getId(), customer.getName(), customer.getSalary(), customer.getEmail());
        } else {
            return null;
        }


    }

    @Override
    public CustomerDto getCustomerById(int id) {
        Optional<Customer> byid = repo.findById(id);
        if (byid.isPresent()) {
            Customer customer = byid.get();
            return new CustomerDto(customer.getId(), customer.getName(), customer.getSalary(), customer.getEmail());
        } else {
            return null;
        }


    }


    @Override
    public CustomerDto getCustomerByEmail(String email) {
        Optional<Customer> byemail = repo.findByEmail(email);
        if (byemail.isPresent()) {
            Customer customer = byemail.get();
            return new CustomerDto(customer.getId(), customer.getName(), customer.getSalary(), customer.getEmail());
        }


        return null;

    }
}
