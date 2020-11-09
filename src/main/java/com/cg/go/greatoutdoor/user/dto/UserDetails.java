package com.cg.go.greatoutdoor.user.dto;
import java.util.Set;
public class UserDetails {
	private String userName;
	private int userId;
	private String userType;
	private String userPassword;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	 public UserDetails(){

	    }

	public UserDetails(String userName, int userId, String userType,String userPassword) {
		//super();
		this.userName = userName;
		this.userId = userId;
		this.userType = userType;
		this.userPassword = userPassword;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	

}
