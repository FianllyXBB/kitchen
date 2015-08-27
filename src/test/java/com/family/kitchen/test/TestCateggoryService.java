package com.family.kitchen.test;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.family.kitchen.back.category.ao.CategoryAo;
import com.family.kitchen.back.category.po.Category;
import com.family.kitchen.back.category.service.BackCategoryService;
import com.family.kitchen.util.UUIDUtil;

/**
 * 
 *<p>Title:TestCateggoryService.java</p>
 * @Package com.family.kitchen.test
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月13日 下午1:17:37
 */
public class TestCateggoryService {

	private ApplicationContext applicationContext;
	
	@Before
	public void createContext() {
		applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
	}
	
	@Test
	public void testAddCategory() throws IOException {
		BackCategoryService backCategoryService = (BackCategoryService) applicationContext.getBean("backCategoryService");
		Category category = new Category();
		category.setCategoryid(UUIDUtil.randomUUID());
		category.setCategoryname("套餐");
		backCategoryService.addCategory(category);
		category.setCategoryid(UUIDUtil.randomUUID());
		category.setCategoryname("饮料");
		backCategoryService.addCategory(category);
		category.setCategoryid(UUIDUtil.randomUUID());
		category.setCategoryname("食材");
		backCategoryService.addCategory(category);
		category.setCategoryid(UUIDUtil.randomUUID());
		category.setCategoryname("水果");
		backCategoryService.addCategory(category);
	}
	
	@Test
	public void testUpdateCategory() throws IOException {
		BackCategoryService backCategoryService = (BackCategoryService) applicationContext.getBean("backCategoryService");	
		backCategoryService.updateCategory("616e917d09034868b02d8f38282df45a","啊发货手机壳");
	}
	
	@Test
	public void testSelectSingleCategory() throws IOException {
		BackCategoryService backCategoryService = (BackCategoryService) applicationContext.getBean("backCategoryService");	
		CategoryAo categoryAo = backCategoryService.selectSingleCategory("啊发货手机壳");
		System.out.println(categoryAo);
	}
}
