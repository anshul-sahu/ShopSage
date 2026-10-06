package com.shopSage.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shopSage.entities.GeneralUser;


public interface GeneralUserRepo extends JpaRepository<GeneralUser, Integer>{
	
	@Query(value = "select * from general_users where user_id = :userId", nativeQuery=true)
	public GeneralUser getGenUserByUserId(Integer userId);
}
