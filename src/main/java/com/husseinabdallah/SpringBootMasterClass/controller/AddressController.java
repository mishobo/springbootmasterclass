package com.husseinabdallah.SpringBootMasterClass.controller;


import com.husseinabdallah.SpringBootMasterClass.entity.Address;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping(path = "/create-address", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ApiResponse<Address>> createAddress(@RequestBody Address address) {
        return addressService.addAddress(address);
    }

    @GetMapping(path = "/get-address", produces = "application/json")
    public ResponseEntity<ApiResponse<Address>> getAddress(@RequestParam(name = "addressId") int addressId) {
        return addressService.getAddress(addressId);
    }

}
