package com.family.kitchen.user.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.kitchen.user.mapper.UserMapper;
import com.family.kitchen.user.po.User;
import com.family.kitchen.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public void add(User user) throws IOException {
		userMapper.insertSingleUser(user);		
	}

	public User findUserByUsername(String username) throws IOException {
		User user = userMapper.selectUserByUsername(username);
		return user;
	}

	public User findUserByEmail(String email) throws IOException {
		User user = userMapper.selectUserByEmail(email);
		return user;
	}

	

}
