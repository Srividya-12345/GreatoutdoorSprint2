package com.cg.go.greatoutdoor.user.service;

import com.cg.go.greatoutdoor.user.entity.UserEntity;

	public interface IUserService {
		
		public UserEntity addUser(UserEntity user);
		public UserEntity loginUser(UserEntity u);
		public UserEntity logout(UserEntity user);
	}


