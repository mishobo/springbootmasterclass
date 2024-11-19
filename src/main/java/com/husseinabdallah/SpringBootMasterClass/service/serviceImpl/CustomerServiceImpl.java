package com.husseinabdallah.SpringBootMasterClass.service.serviceImpl;

import com.husseinabdallah.SpringBootMasterClass.entity.Customer;
import com.husseinabdallah.SpringBootMasterClass.exception.CustomerAlreadyExistsException;
import com.husseinabdallah.SpringBootMasterClass.exception.NoSuchCustomerExistsException;
import com.husseinabdallah.SpringBootMasterClass.repository.CustomerRepository;
import com.husseinabdallah.SpringBootMasterClass.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).orElseThrow(
                () -> new NoSuchCustomerExistsException("NO CUSTOMER PRESENT WITH ID = " + id));
    }

    @Override
    public String addCustomer(Customer customer) {
        Customer existingCustomer = customerRepository.findById(customer.getId())
                .orElse(null);
        if (existingCustomer == null) {
            customerRepository.save(customer);
            return "Customer added successfully";
        }
        else
            throw new CustomerAlreadyExistsException(
                    "Customer already exists!!");
    }

    @Override
    public String updateCustomer(Customer customer) {
        Customer existingCustomer = customerRepository.findById(customer.getId()).orElse(null);

        if (existingCustomer == null)
            throw new NoSuchCustomerExistsException(
                    "No Such Customer exists!!");
        else {
            existingCustomer.setName(customer.getName());
            existingCustomer.setAddress(customer.getAddress());
            customerRepository.save(existingCustomer);
            return "Record updated Successfully";
        }
    }
}
