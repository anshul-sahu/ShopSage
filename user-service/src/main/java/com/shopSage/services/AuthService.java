package com.shopSage.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.shopSage.dtos.SigninDto;
import com.shopSage.dtos.UserSignUpDto;
import com.shopSage.entities.AccountStatus;
import com.shopSage.entities.GeneralUser;
import com.shopSage.entities.User;
import com.shopSage.repos.GeneralUserRepo;
import com.shopSage.repos.UserRepo;

@Service
public class AuthService {
	
	private UserRepo userRepo;
	private GeneralUserRepo generalUserRepo;
	
	public AuthService(UserRepo userRepo, GeneralUserRepo generalUserRepo) {
		this.userRepo = userRepo;
		this.generalUserRepo = generalUserRepo;
	}
	
	public UserSignUpDto getUser(String email) {
		UserSignUpDto dto = new UserSignUpDto();
		User user = userRepo.getUserByEmail(email);
		BeanUtils.copyProperties(user, dto);
		GeneralUser genUser = generalUserRepo.getGenUserByUserId(user.getUserId());
		BeanUtils.copyProperties(genUser, dto);
		return dto;
	}
	public Boolean EmailExists(String email) {
		User user = userRepo.findByEmail(email);
		if(user == null) {
			return false;
		}else {
			return true;
		}
	}
    public Boolean signIn(SigninDto dto) {
		if(EmailExists(dto.getEmail())) {
			System.out.println("failed 1");
			User user = userRepo.findByEmail(dto.getEmail());
			return user.getPassword().equals(dto.getPassword());
		}else {
			System.out.println("failed 2");
			return false;
		}
	}
	
	public Boolean saveUser(UserSignUpDto dto) {
		User user = new User();
		dto.setAccountStatus(AccountStatus.Active);
		dto.setCreatedAt(LocalDateTime.now());
		dto.setUpdatedAt(LocalDateTime.now());
		dto.setEmailVerified(true);
		dto.setPhoneVerified(true);
		BeanUtils.copyProperties(dto, user);
		User ans = userRepo.save(user);
		
		GeneralUser genUser = new GeneralUser();
		BeanUtils.copyProperties(dto, genUser);
		User userId = new User();
		userId.setUserId(user.getUserId());
		genUser.setUser(userId);
		GeneralUser ansGen =  generalUserRepo.save(genUser);
		
		return ans != null && ansGen != null;
	}
}
