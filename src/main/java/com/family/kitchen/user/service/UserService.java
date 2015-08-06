package com.family.kitchen.user.service;

import java.io.IOException;

import com.family.kitchen.user.ao.UserAo;
import com.family.kitchen.user.po.User;
import com.family.kitchen.user.web.vo.UserVo;

public interface UserService {
	
	public void add(User user) throws IOException; 
	
	public User findUserByUsername(String username) throws IOException;
	
	public User findUserByEmail(String email) throws IOException;
	
	public UserAo findSingleUser(UserVo userVo) throws IOException;

	public UserAo signin(String username, String phonenumber) throws IOException;
	
}
