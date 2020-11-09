package com.cg.go.greatoutdoor.user.controllers;

import javax.validation.Valid;

import com.cg.go.greatoutdoor.user.entity.UserEntity;
import com.cg.go.greatoutdoor.user.util.UserUtil;
import com.cg.go.greatoutdoor.user.service.IUserService;
import com.cg.go.greatoutdoor.user.dto.UserDetails;
import com.cg.go.greatoutdoor.user.dto.AddUserRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@Validated
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private UserUtil userUtil;

    @PostMapping("/p/users/add")
    public UserDetails addUser(@RequestBody @Valid AddUserRequest requestData){
       
    	UserEntity user=new UserEntity(requestData.getUserName(),requestData.getUserType(),requestData.getUserPassword());
        user= userService.addUser(user);
        UserDetails userDetails= userUtil.toUserDetails(user);
        return userDetails;
    }



}
