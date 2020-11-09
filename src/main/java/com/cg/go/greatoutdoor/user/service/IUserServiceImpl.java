package com.cg.go.greatoutdoor.user.service;

import javax.transaction.Transactional;
import com.cg.go.greatoutdoor.user.dao.IUserRepositotory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.go.greatoutdoor.user.entity.UserEntity;

@Transactional
@Service
public class IUserServiceImpl implements IUserService {

	@Autowired
	private IUserRepositotory userRepository;

	@Override
	public UserEntity addUser(UserEntity user)
	{
		user= userRepository.addUser(user);
	       return user;
	}
	@Override
	public UserEntity loginUser(UserEntity u)
	{
		u=userRepository.addUser(u);
		return u;
	}
	@Override
	public UserEntity logout(UserEntity user)
	{
		user = userRepository.logout(user);
		return user;
	}
	
	
	
}
