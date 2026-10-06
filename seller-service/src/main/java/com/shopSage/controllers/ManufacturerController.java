package com.shopSage.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopSage.dtos.ManufacturerDto;
import com.shopSage.services.ManufacturerService;

@RestController
public class ManufacturerController {
	
	private ManufacturerService manuSrv;
	
	public ManufacturerController(ManufacturerService manuSrv) {
		this.manuSrv = manuSrv;
	}
	
	@PostMapping("/seller/manufacturer/register")
	public ResponseEntity<String> registerManufacturer(@RequestBody ManufacturerDto dto){
		Boolean resp = manuSrv.registerManufacturer(dto);
		if(resp) {
			return new ResponseEntity<>("successful", HttpStatus.OK);
		}else {
			return new ResponseEntity<>("unsuccessful",HttpStatus.BAD_REQUEST);
		}
	}
}
