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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="general_users")
public class GeneralUser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer generalUserId;
	@Column(nullable=false, length=30)
	private String firstName;
	@Column(nullable=false, length=30)
	private String lastName;
	@Column(nullable=false)
	private Gender gender;
	@Column(nullable=false)
	private LocalDate dateOfBirth;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy="generalUser", cascade=CascadeType.ALL)
	private List<Address> address;
	
	

	public Integer getGeneralUserId() {
		return generalUserId;
	}
	public void setGeneralUserId(Integer generalUserId) {
		this.generalUserId = generalUserId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
