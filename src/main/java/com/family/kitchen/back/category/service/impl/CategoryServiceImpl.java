package com.family.kitchen.back.category.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.kitchen.back.category.mapper.BackCategoryMapper;
import com.family.kitchen.back.category.po.Category;
import com.family.kitchen.back.category.service.CategoryService;

/**
 * 
 *<p>Title:CategoryServiceImpl.java</p>
 * @Package com.family.kitchen.back.category.service.impl
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月13日 上午11:33:52
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private BackCategoryMapper backCategoryMapper;
	
	public void addCategory(Category category) throws IOException {
		backCategoryMapper.insertSingleCategory(category);
	}

}
