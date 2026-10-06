package com.shopSage.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shopSage.entities.AccountStatus;
import com.shopSage.entities.Gender;
import com.shopSage.entities.Role;


public class UserSignUpDto {
	private String firstName;
	private String lastName;
	private Gender gender;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dateOfBirth;
	private String email;
	private String phone;
	private String password;
	private String profileImage;
	private AccountStatus accountStatus;
	private Boolean emailVerified;
	private Boolean phoneVerified;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private Role role;
	
	@Override
	public String toString() {
		return "UserSignUpDto [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", phone=" + phone + ", password=" + password
				+ ", profileImage=" + profileImage + ", accountStatus=" + accountStatus + ", emailVerified="
				+ emailVerified + ", phoneVerified=" + phoneVerified + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + ", role=" + role + "]";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public AccountStatus getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}
	public Boolean getEmailVerified() {
		return emailVerified;
	}
	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
	}
	public Boolean getPhoneVerified() {
		return phoneVerified;
	}
	public void setPhoneVerified(Boolean phoneVerified) {
		this.phoneVerified = phoneVerified;
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
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}
