package com.shopSage.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopSage.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
