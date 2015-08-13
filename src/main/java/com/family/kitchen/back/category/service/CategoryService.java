package com.family.kitchen.back.category.service;

import java.io.IOException;

import com.family.kitchen.back.category.po.Category;

/**
 * 
 *<p>Title:CategoryService.java</p>
 * @Package com.family.kitchen.back.category.service
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月13日 上午11:31:16
 */
public interface CategoryService {
	
	public void addCategory(Category category) throws IOException;
}
