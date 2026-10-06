package com.shopSage.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shopSage.entities.Category;
import com.shopSage.repos.CategoryRepo;

@Component
public class CategoryDataInitializer implements CommandLineRunner{
	
	private CategoryRepo catRepo;

	public CategoryDataInitializer(CategoryRepo catRepo) {
		this.catRepo = catRepo;
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		if(catRepo.count() == 0) {
			List<Category> list = List.of(
					 	createCategory("Electronics"),
	                    createCategory("Fashion"),
	                    createCategory("Home & Kitchen"),
	                    createCategory("Beauty & Personal Care"),
	                    createCategory("Grocery"),
	                    createCategory("Sports & Fitness"),
	                    createCategory("Books & Stationery"),
	                    createCategory("Toys & Games"),
	                    createCategory("Automotive"),
	                    createCategory("Jewellery & Accessories")
					);
			catRepo.saveAll(list);
			System.out.println("inserted all category");
		}
	}
	
	private Category createCategory(String name) {
		Category category = new Category();
		category.setName(name);
		return category;
	}
}
