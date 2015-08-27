package com.family.kitchen.test;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.family.kitchen.back.category.ao.CategoryAo;
import com.family.kitchen.back.category.service.BackCategoryService;
import com.family.kitchen.util.PageSet;

public class TestBackCategoryService {

	private ApplicationContext applicationContext;
	
	@Before
	public void createContext() {
		applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
	}
	
	@Test
	public void testSelectAll() throws IOException {
		BackCategoryService backCategoryService = (BackCategoryService) applicationContext.getBean("backCategoryService");
		PageSet<CategoryAo> pageData = backCategoryService.categoryQuery(null);
		System.out.println(pageData);
	}
}
