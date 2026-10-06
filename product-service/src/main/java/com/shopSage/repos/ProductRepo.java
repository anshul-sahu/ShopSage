package com.shopSage.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopSage.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
