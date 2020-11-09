package com.cg.go.greatoutdoor.user.util;

import com.cg.go.greatoutdoor.user.dto.*;
import com.cg.go.greatoutdoor.user.entity.UserEntity;

public class UserUtil 
{
	public UserDetails toUserDetails(UserEntity user)
	{
        UserDetails userDetails=new UserDetails(user.getUserName(),user.getUserId(),user.getUserType(),user.getUserPassword());
        
     return userDetails;
}
}