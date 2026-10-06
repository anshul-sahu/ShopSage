package com.shopSage.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.shopSage.dtos.ManufacturerDto;
import com.shopSage.entites.Manufacturer;
import com.shopSage.repos.ManufacturerRepo;

@Service
public class ManufacturerService {
	private ManufacturerRepo manuRepo;

	public ManufacturerService(ManufacturerRepo manuRepo) {
		this.manuRepo = manuRepo;
	}
	
	public Boolean registerManufacturer(ManufacturerDto dto) {
		Manufacturer manufacturer = new Manufacturer();
		BeanUtils.copyProperties(dto, manufacturer);
		
		Manufacturer resp = manuRepo.save(manufacturer);
		
		return resp != null;
	}
}
