package com.shopSage.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopSage.entities.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer>{

}
