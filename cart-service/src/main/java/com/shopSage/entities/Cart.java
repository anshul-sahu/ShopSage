package com.shopSage.entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="carts")
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cartId;
	@Column(nullable=false)
	private LocalDateTime createdAt;
	@Column(nullable=false)
	private LocalDateTime updatedAt;
	@Column(nullable=false)
	private Integer cartItems;
	@Column(nullable=false)
	private Float totalAmount;
	@Column(nullable=false)
	private Status status;
	@Column(nullable=false)
	private Mode paymentMode;
	@Column(nullable=false)
	private Integer userId;
	@OneToMany(mappedBy="cart", cascade=CascadeType.ALL)
	private List<CartItem> cartItem;
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Integer getCartItems() {
		return cartItems;
	}
	public void setCartItems(Integer cartItems) {
		this.cartItems = cartItems;
	}
	public Float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Mode getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(Mode paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public List<CartItem> getCartItem() {
		return cartItem;
	}
	public void setCartItem(List<CartItem> cartItem) {
		this.cartItem = cartItem;
	}
	
	
}
