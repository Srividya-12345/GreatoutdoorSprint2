package com.cg.go.greatoutdoor.user.entity;
	import java.util.Objects;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.NamedQuery;
	@Entity
	@NamedQuery(name = "Loggin in", query = "select c from Userdata c where c.userName = :username and c.userPassword=:password")
	public class UserEntity {
		
		private String userName;
		@Id
		@GeneratedValue
		private int userId;
		private String userType;
		private String userPassword;
		public UserEntity(String userName, String userType, String userPassword) {
			this.userName = userName;
			//this.userId = userId;
			this.userType = userType;
			this.userPassword = userPassword;
		}
		public UserEntity() {
		}
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
		@Override
		public int hashCode() {
			int hash=Objects.hashCode(userId);
			return hash;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			UserEntity other = (UserEntity) obj;
			if (userId != other.userId)
				return false;
			return true;
		}
		
	}
