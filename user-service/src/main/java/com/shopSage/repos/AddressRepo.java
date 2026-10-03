package com.shopSage.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopSage.entities.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
