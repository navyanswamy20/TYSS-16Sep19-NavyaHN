package com.tyss.assetmanagementsystem.dto;

import java.util.List;

public class AssetResponse {
	private int statusCode;
	private String message;
	private  String description;
	private List<Assets> Assets;
public List<Assets> getAssets() {
		return Assets;
	}
	public void setAssets(List<Assets> assets) {
		Assets = assets;
	}
		//	private UsersBean bean;
//public UsersBean getBean() {
//		return bean;
//	}
//	public void setBean(UsersBean bean) {
//		this.bean = bean;
//	}
		private String userType;
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
