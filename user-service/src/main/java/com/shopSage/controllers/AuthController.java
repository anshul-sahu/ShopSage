package com.shopSage.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopSage.dtos.ApiResponse;
import com.shopSage.dtos.SigninDto;
import com.shopSage.dtos.UserSignUpDto;
import com.shopSage.entities.AccountStatus;
import com.shopSage.services.AuthService;

@RestController
public class AuthController {
	
	private AuthService authServ;
	
	public AuthController(AuthService authServ) {
		super();
		this.authServ = authServ;
	}
	
	@PostMapping("/user/signin")
	public ResponseEntity<ApiResponse> signIn(@RequestBody SigninDto dto){
		
		if(authServ.signIn(dto)) {
			System.out.println("success");
			return new ResponseEntity<>(new ApiResponse(true, "successful login", authServ.getUser(dto.getEmail())), HttpStatus.OK);
		}else {
			System.out.println("failed");
			return new ResponseEntity<>(new ApiResponse(false, "either email or password is wrong"), HttpStatus.BAD_REQUEST);
		}
		
	}

	@PostMapping("/user/signup")
	public ResponseEntity<String> signup(@RequestBody UserSignUpDto userSignUpDto){
		System.out.println(userSignUpDto);
		Boolean ans = authServ.saveUser(userSignUpDto);
		if(ans)
		return new ResponseEntity<>("successful",HttpStatus.OK);
		else 
			return new ResponseEntity<>("failed to save",HttpStatus.BAD_REQUEST);
	}
}
