package com.tyss.assetmanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_master")
public class UsersBean {

	@Id
	@Column(name = "UserId")
	private Integer userId;
	@Column(name = "UserName")
	private String userName;
	@Column(name = "UserPassword")
	private String userPassword;
	@Column(name = "UserType")
	private String userType;

	// Getters and Setters
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "UsersBean [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userType=" + userType + "]";
	}// end of ToString()

}// end of class
