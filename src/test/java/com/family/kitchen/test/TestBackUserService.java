package com.family.kitchen.test;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.family.kitchen.back.user.ao.BackUserAo;
import com.family.kitchen.back.user.service.BackUserService;
import com.family.kitchen.back.user.web.vo.BackUserVo;
import com.family.kitchen.util.PageSet;

public class TestBackUserService {

	private ApplicationContext applicationContext;
	
	@Before
	public void createContext() {
		applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
	}
	
	@Test
	public void testSelectAll() throws IOException {
		BackUserService backUserService = (BackUserService) applicationContext.getBean("backUserService");
		BackUserVo backUserVo = new BackUserVo();
		backUserVo.setBackUserAo(new BackUserAo());
		backUserVo.setPagesize(10);
		backUserVo.setStartRow(0);
		PageSet<BackUserAo> pageSet = backUserService.selectAll(backUserVo);
		System.out.println(pageSet);
	}
}
