package com.husseinabdallah.SpringBootMasterClass.service.serviceImpl;

import com.husseinabdallah.SpringBootMasterClass.entity.Customer;
import com.husseinabdallah.SpringBootMasterClass.exception.CustomerAlreadyExistsException;
import com.husseinabdallah.SpringBootMasterClass.exception.NoSuchCustomerExistsException;
import com.husseinabdallah.SpringBootMasterClass.model.CustomerDto;
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
        System.out.println("customerRepository = " + customerRepository.findCustomerById(id));
        return customerRepository.findCustomerById(id);
    }

    @Override
    public String addCustomer(CustomerDto customer) {
        Customer existingCustomer = customerRepository.findCustomerById(customer.id());

        if (existingCustomer == null) {
            Customer newCustomer = new Customer();

            customerRepository.save(newCustomer);
            return "Customer added successfully";
        }
        else
            throw new CustomerAlreadyExistsException(
                    "Customer already exists!!");
    }

    @Override
    public String updateCustomer(CustomerDto customer) {
        Customer existingCustomer = customerRepository.findCustomerById(customer.id());

        System.out.println("existingCustomer = " + existingCustomer);
        if (existingCustomer == null)
            throw new NoSuchCustomerExistsException(
                    "No Such Customer exists!!");
        else {

            Customer updatedCustomer = new Customer();
            customerRepository.save(updatedCustomer);
            return "Record updated Successfully";
        }
    }
}
