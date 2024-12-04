package com.husseinabdallah.SpringBootMasterClass.service.serviceImpl;

import com.husseinabdallah.SpringBootMasterClass.entity.Address;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import com.husseinabdallah.SpringBootMasterClass.repository.AddressRepo;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;


    public AddressServiceImpl(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    @Override
    public ResponseEntity<ApiResponse<Address>> addAddress(Address address) {
        var addressId = addressRepo.save(address);
        ApiResponse<Address> response = new ApiResponse<>(
                "successful",
                "data saved successfully",
                addressId,
                null
        );

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<ApiResponse<Address>> getAddress(int addressId) {
        var address = addressRepo.findByAddressId(addressId);

            ApiResponse<Address> response = new ApiResponse<>(
                    "successful",
                    "data fetched successfully",
                    address,
                    null
            );

        return ResponseEntity.ok(response);
    }
}
