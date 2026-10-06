package com.shopSage.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopSage.entities.CartItem;

public interface CartItemRepo extends JpaRepository<CartItem, Integer>{

}
