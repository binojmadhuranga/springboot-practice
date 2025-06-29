package lk.acpt.demo.afsd.service.impl;

import lk.acpt.demo.afsd.dto.CustomerDto;
import lk.acpt.demo.afsd.service.CustomerService;

import java.util.List;

public class CustomerServiceIMPL implements CustomerService {


    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return null;
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
    public int deleteCustomer(int id) {
        return 0;
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
