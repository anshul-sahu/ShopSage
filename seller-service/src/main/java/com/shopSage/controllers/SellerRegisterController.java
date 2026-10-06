package com.shopSage.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopSage.dtos.SellerDto;
import com.shopSage.services.SellerService;

@RestController
public class SellerRegisterController {
	
	private SellerService sellerServ;
	
	public SellerRegisterController(SellerService sellerServ) {
		this.sellerServ = sellerServ;
	}

	@PostMapping("/seller/register")
	public ResponseEntity<String> registerSeller(@RequestBody SellerDto dto){
		Boolean resp = sellerServ.registerSeller(dto);
		if(resp) {
			return new ResponseEntity<>("successful", HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>("successful", HttpStatus.BAD_REQUEST);	
		}
	}
	
}
