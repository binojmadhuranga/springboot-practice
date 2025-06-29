package lk.acpt.demo.afsd.service;

import lk.acpt.demo.afsd.dto.CustomerDto;

import java.util.List;

public interface CustomerService {


    public CustomerDto saveCustomer(CustomerDto customerDto);
    public CustomerDto updateCustomer(CustomerDto customerDTO);
    public List<CustomerDto > getAllCustomers();
    public int deleteCustomer(int id);
    public CustomerDto getCustomerById(int id);
    public CustomerDto getCustomerByEmail(String email);







}
