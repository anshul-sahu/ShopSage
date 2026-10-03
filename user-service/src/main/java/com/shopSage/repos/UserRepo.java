package com.shopSage.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopSage.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
