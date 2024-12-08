package com.husseinabdallah.SpringBootMasterClass.service.interfaces;

import com.husseinabdallah.SpringBootMasterClass.entity.Customer;
import com.husseinabdallah.SpringBootMasterClass.model.CustomerDto;

public interface CustomerService {

    // Method to get customer by its Id
    Customer getCustomer(Long id);

    // Method to add a new Customer
    // into the database
    String addCustomer(CustomerDto customer);

    // Method to update details of a Customer
    String updateCustomer(CustomerDto customer);
}
