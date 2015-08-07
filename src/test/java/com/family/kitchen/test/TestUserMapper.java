package com.family.kitchen.test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.family.kitchen.user.po.User;
import com.family.kitchen.user.service.UserService;
import com.family.kitchen.util.UUIDUtil;

public class TestUserMapper {

	private ApplicationContext applicationContext;
	
	@Before
	public void createContext() {
		applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
	}
	
	@Test
	public void testUUID(){
		String uuid = UUIDUtil.randomUUID();
		System.out.println(uuid + "  " + uuid.length());
	}
	
	@Test
	public void insertUserList() throws IOException {
		UserService userService = (UserService) applicationContext.getBean("userService");
		List<User> list = new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			User user = new User();
			user.setUserid(UUIDUtil.randomUUID());
			user.setUsername("青椒肉丝" + (i+2));
			user.setPassword("images/01.jpg");
			user.setEmail("非常好吃奥");
			user.setPhonenumber("12");
			user.setCode(UUIDUtil.randomUUID() + UUIDUtil.randomUUID());
			list.add(user);
		}
			
		userService.insertUserList(list);
	}
}
