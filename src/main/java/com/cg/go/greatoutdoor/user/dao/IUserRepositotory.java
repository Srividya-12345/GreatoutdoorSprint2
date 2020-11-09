package com.cg.go.greatoutdoor.user.dao;
import com.cg.go.greatoutdoor.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import org.apache.catalina.User;

	public interface IUserRepositotory extends JpaRepository<User,Long>
	{
		public UserEntity addUser(UserEntity user);
		public UserEntity loginUser(UserEntity u);
		public UserEntity logout(UserEntity user);
	}
