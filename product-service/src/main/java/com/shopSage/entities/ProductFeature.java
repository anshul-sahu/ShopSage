package com.shopSage.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product_features")
public class ProductFeature {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productFeatureId;
	@Column(nullable=false, length=500)
	private String feature;
	@ManyToOne
	@JoinColumn(name="product_brand_id")
	private ProductBrand productBrand;
	public Integer getProductFeatureId() {
		return productFeatureId;
	}
	public void setProductFeatureId(Integer productFeatureId) {
		this.productFeatureId = productFeatureId;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public ProductBrand getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(ProductBrand productBrand) {
		this.productBrand = productBrand;
	}
	
	
}
