package com.shopSage.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product_images")
public class ProductImage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productImageId;
	@Column(nullable=false, length=200)
	private String imageUrl;
	@Column(nullable=false)
	private LocalDate uploadedAt;
	@ManyToOne
	@JoinColumn(name="product_brand_id")
	private ProductBrand productBrand;
	public Integer getProductImageId() {
		return productImageId;
	}
	public void setProductImageId(Integer productImageId) {
		this.productImageId = productImageId;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public LocalDate getUploadedAt() {
		return uploadedAt;
	}
	public void setUploadedAt(LocalDate uploadedAt) {
		this.uploadedAt = uploadedAt;
	}
	public ProductBrand getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(ProductBrand productBrand) {
		this.productBrand = productBrand;
	}
	
	
}
