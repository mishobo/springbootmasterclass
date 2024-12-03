package com.husseinabdallah.SpringBootMasterClass.repository;

import com.husseinabdallah.SpringBootMasterClass.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {

    Address findByAddressId(int addressId);

}
