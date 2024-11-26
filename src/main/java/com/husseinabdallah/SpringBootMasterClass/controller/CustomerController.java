package com.husseinabdallah.SpringBootMasterClass.controller;

import com.husseinabdallah.SpringBootMasterClass.entity.Customer;
import com.husseinabdallah.SpringBootMasterClass.exception.CustomerAlreadyExistsException;
import com.husseinabdallah.SpringBootMasterClass.exception.ErrorResponse;
import com.husseinabdallah.SpringBootMasterClass.model.CustomerDto;
import com.husseinabdallah.SpringBootMasterClass.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Exception Handler method added in CustomerController to handle CustomerAlreadyExistsException
//    @ExceptionHandler(value = CustomerAlreadyExistsException.class)
//    @ResponseStatus(HttpStatus.CONFLICT)
//    public ErrorResponse handleCustomerAlreadyExistsException(CustomerAlreadyExistsException ex) {
//        return new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage());
//    }

    @GetMapping(value = "/getCustomer/{id}", produces = "application/json")
    public Customer getCustomer(@PathVariable("id") Long id) {
        return customerService.getCustomer(id);
    }

    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody CustomerDto customer) {
        return customerService.addCustomer(customer);
    }

    @PutMapping("/updateCustomer")
    public String updateCustomer(@RequestBody CustomerDto customer) {
        return customerService.updateCustomer(customer);
    }

}
