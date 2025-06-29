package lk.acpt.demo.afsd.service;

import lk.acpt.demo.afsd.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {


    CustomerDto saveCustomer(CustomerDto customerDto);
    CustomerDto updateCustomer(CustomerDto customerDTO);
    List<CustomerDto > getAllCustomers();
    CustomerDto deleteCustomer(int id);
    CustomerDto getCustomerById(int id);
    CustomerDto getCustomerByEmail(String email);







}
