package com.shopSage.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="product_brands")
public class ProductBrand {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productBrandId;
	@Column(nullable=false, length=100)
	private String brandName;
	@Column(nullable=false, length=2000)	
	private String description;
	@Column(nullable=false)	
	private Float price;
	@Column(nullable=false)	
	private LocalDate createdAt;
	@Column(nullable=false)	
	private LocalDate updatedAt;
	@Column(nullable=false)	
	private Float rating;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	@OneToMany(mappedBy="productBrand", cascade=CascadeType.ALL)
	private List<ProductImage> productImage;
	
	public Integer getProductBrandId() {
		return productBrandId;
	}

	public void setProductBrandId(Integer productBrandId) {
		this.productBrandId = productBrandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<ProductImage> getProductImage() {
		return productImage;
	}

	public void setProductImage(List<ProductImage> productImage) {
		this.productImage = productImage;
	}

	
	
	
}
