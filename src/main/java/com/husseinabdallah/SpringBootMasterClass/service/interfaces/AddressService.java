package com.husseinabdallah.SpringBootMasterClass.service.interfaces;

import com.husseinabdallah.SpringBootMasterClass.entity.Address;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import org.springframework.http.ResponseEntity;

public interface AddressService {

    ResponseEntity<ApiResponse<Address>> addAddress(Address address);

    ResponseEntity<ApiResponse<Address>> getAddress(int addressId);

}