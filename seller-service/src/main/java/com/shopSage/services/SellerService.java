package com.shopSage.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.shopSage.dtos.SellerDto;
import com.shopSage.entites.Seller;
import com.shopSage.repos.SellerRepo;

@Service
public class SellerService {
	private SellerRepo sellerRepo;

	public SellerService(SellerRepo sellerRepo) {
		this.sellerRepo = sellerRepo;
	}
	
	public Boolean registerSeller(SellerDto dto) {
		Seller seller = new Seller();
		BeanUtils.copyProperties(dto, seller);
		Seller ans = sellerRepo.save(seller);
		return ans != null;
	}
}
