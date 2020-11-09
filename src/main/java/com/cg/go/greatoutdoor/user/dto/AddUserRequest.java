package com.cg.go.greatoutdoor.user.dto;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;
public class AddUserRequest {

	private String userName;
	private int userId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
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
	private String userType;
	private String userPassword;
}
