package com.family.kitchen.user.service;

import java.io.IOException;

import com.family.kitchen.user.po.User;

public interface UserService {
	
	public void add(User user) throws IOException; 
	
	public User findUserByUsername(String username) throws IOException;
	
	public User findUserByEmail(String email) throws IOException;
	
}
