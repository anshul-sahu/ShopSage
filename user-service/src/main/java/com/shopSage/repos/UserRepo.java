package com.shopSage.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shopSage.entities.User;
import java.util.List;


public interface UserRepo extends JpaRepository<User, Integer>{
	@Query(value="select * from users where email = :email", nativeQuery=true)
	public User findByEmail(String email);
	
	@Query(value = "select * from users where email = :email", nativeQuery = true)
	public User getUserByEmail(String email);
}
